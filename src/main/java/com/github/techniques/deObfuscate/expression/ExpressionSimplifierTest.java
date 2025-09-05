package com.github.techniques.deObfuscate.expression;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionSimplifierTest {

    /**
     * A helper method to run the simplifier on a given code snippet and return the result.
     * This avoids repeating the lexer/parser setup in every test.
     *
     * @param code The source code to simplify.
     * @return The simplified code.
     */
    private String simplifyCode(String code) {
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        ParseTree tree = parser.program();

        ExpressionSimplifier simplifier = new ExpressionSimplifier(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(simplifier, tree);

        return simplifier.getRewrittenCode();
    }

    @Test
    public void testSubtractionOfNegative_ShouldBecomeAddition() {
        String code = "int main() { int result = 10 - (-5); }";
        String expected = "int main() { int result = 15; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testSimpleSubtraction_ShouldRemainUnchanged() {
        String code = "int main() { int result = 10 - 5; }";
        String expected = "int main() { int result = 5; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testAdditionWithNegative_ShouldRemainUnchanged() {
        String code = "int main() { int result = 10 + (-5); }";
        String expected = "int main() { int result = 5; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testOtherBinaryOperation_ShouldRemainUnchanged() {
        String code = "int main() { int result = 10 * (-5); }";
        String expected = "int main() { int result = -50; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testNestedExpressionWithSimplification() {
        String code = "int main() { int result = 100 + (20 - (-30)); }";
        String expected = "int main() { int result = 150; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testMultipleSimplificationsInOneLine() {
        String code = "int main() { int result = (1 - (-2)) - (-3); }";
        String expected = "int main() { int result = 6; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testNoSimplificationInComplexExpression() {
        String code = "int main() { int result = (a + b) * (c - d); }";
        String expected = "int main() { int result = (a + b) * (c - d); }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testHandleMoreComplexExpressionsInvolvingMultiplication() {
        String code = "int main() { i = ((i * 3) - (-1 * 3)) / 3; }";
        String expected = "int main() { i = i + 1; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }
    @Test
    public void testHandleMoreComplexExpressionsInvolvingNegation() {
        String code = "int main() { x = a - (b * -1); }";
        String expected = "int main() { x = a + b; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }
    @Test
    public void testShouldSimplifyDistributivePropertyWithNegation() {
        String code = "int main() { int result = ((x * 3) - (-x * 3)) / 3; }";
        String expected = "int main() { int result = 2 * x; }";
        String actual = simplifyCode(code);
        assertEquals(expected, actual.trim());
    }
}
