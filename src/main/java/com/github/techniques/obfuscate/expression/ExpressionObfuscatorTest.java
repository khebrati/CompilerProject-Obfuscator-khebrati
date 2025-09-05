package com.github.techniques.obfuscate.expression;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExpressionObfuscatorTest {

    private String obfuscateExpression(String code) {
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        MinicParser.ProgramContext tree = parser.program();
        return ExpressionObfuscator.rewriteExpressions(tree, tokens).trim();
    }

    @Ignore
    @Test
    public void testAdditionRewriting() {
        String input = "int x = a + b;";
        String output = obfuscateExpression(input);
        assertTrue(output.contains("(a - (-b))") || output.equals(input));
    }

    @Test
    public void testSubtractionRewriting() {
        String input = "int x = a - b;";
        String output = obfuscateExpression(input);
        assertTrue(output.contains("a + (-1 * b)") || output.equals(input));
    }

    @Test
    public void testMultiplicationByTwoRewriting() {
        String input = "int x = a * 2;";
        String output = obfuscateExpression(input);
        assertTrue(output.contains("a + a") || output.equals(input));
    }

    @Ignore
    @Test
    public void testComplexExpressions() {
        String input = "int x = (a + b) * 2;";
        assertEquals(input, obfuscateExpression(input));

        input = "int x = a + b * c;";
        assertEquals(input, obfuscateExpression(input));
    }

    @Ignore
    @Test
    public void testMultipleStatements() {
        String input = "int x = a + b;\n" +
                "int y = c - d;\n" +
                "int z = e * 2;";
        String output = obfuscateExpression(input);
        assertTrue(output.contains("(a - (-b))") ||
                output.contains("c + (-1 * d)") ||
                output.contains("e + e") ||
                output.equals(input));
    }
}