package com.github.techniques.deObfuscate.deadcode;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeadCodeRemoverTest {

    private String removeDeadCode(String code) {
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        MinicParser.ProgramContext tree = parser.program();
        return DeadCodeRemover.removeDeadCode(tree, tokens);
    }

    // Helper method to normalize strings for comparison
    private String normalize(String code) {
        return code.replaceAll("\\s+", " ")
                .replaceAll("\\s*\\(\\s*", "(")
                .replaceAll("\\s*\\)\\s*", ")")
                .replaceAll("\\s*\\{\\s*", "{")
                .replaceAll("\\s*}\\s*", "}")
                .replaceAll("\\s*;\\s*", ";")
                .trim();
    }

    @Test
    public void testUnusedVariableRemoval() {
        String input = "int x = 5; int unused = 10; print(x);";
        String expected = "int x = 5; print(x);";
        assertEquals(normalize(expected), normalize(removeDeadCode(input)));
    }

    @Test
    public void testCodeAfterReturn() {
        String input = "{ int x = 5; return x; print(x); }";
        String expected = "{ int x = 5; return x; }";
        assertEquals(normalize(expected), normalize(removeDeadCode(input)));
    }

    @Test
    public void testEmptyBlockRemoval() {
        String input = "if (x > 0) { } while (y < 10) { }";
        String expected = "if (x > 0) while (y < 10)";
        assertEquals(normalize(expected), normalize(removeDeadCode(input)));
    }

    @Test
    public void testComplexCase() {
        String input = "int main() { int x = 5; int unused = 10; if (x > 0) { return x; print(unused); } print(x); }";
        String expected = "int main() { int x = 5; if (x > 0) { return x; } print(x); }";
        assertEquals(normalize(expected), normalize(removeDeadCode(input)));
    }

    @Test
    public void testNestedBlocks() {
        String input = "{ int x = 1; { return x; { print(x); } } }";
        String expected = "{ int x = 1; { return x; } }";
        assertEquals(normalize(expected), normalize(removeDeadCode(input)));
    }
}