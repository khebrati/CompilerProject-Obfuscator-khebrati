package com.github.techniques.deadcode;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeadCodeInserterTest {

    @Test
    public void testDeadCodeInsertion() {
        // Test case 1: Simple function
        String input = "void main() {\n    int x = 10;\n    printf(\"%d\", x);\n}";
        String obfuscated = obfuscateCode(input);

        // Print for debugging
        System.out.println("Original code:\n" + input);
        System.out.println("Obfuscated code:\n" + obfuscated);

        // Verify that the obfuscated code:
        // 1. Contains at least one _dummy variable
        assertTrue("Should contain dummy variables", obfuscated.contains("_dummy"));

        // 2. Still contains the original code
        assertTrue("Should contain original variable", obfuscated.contains("int x = 10"));
        assertTrue("Should contain original print statement", obfuscated.contains("printf(\"%d\", x)"));

        // 3. Is syntactically valid (no parsing errors)
        try {
            var lexer = new MinicLexer(CharStreams.fromString(obfuscated));
            var parser = new MinicParser(new CommonTokenStream(lexer));
            parser.program();
        } catch (Exception e) {
            fail("Obfuscated code should be syntactically valid: " + e.getMessage());
        }
    }

    @Test
    public void testMultipleBlocksDeadCode() {
        String input = """
                void main() {
                    if (1 > 0) {
                        int y = 20;
                    }
                    while (1 < 2) {
                        int z = 30;
                    }
                }""";

        String obfuscated = obfuscateCode(input);

        // Print for debugging
        System.out.println("Original code:\n" + input);
        System.out.println("Obfuscated code:\n" + obfuscated);

        // Check that dead code was potentially inserted in multiple blocks
        assertTrue("Should contain dummy variables", obfuscated.contains("_dummy"));
        assertTrue("Should preserve original if condition", obfuscated.contains("if (1 > 0)"));
        assertTrue("Should preserve original while loop", obfuscated.contains("while (1 < 2)"));
    }

    @Test
    public void testSyntaxValidity() {
        String input = """
                void main() {
                    int sum = 0;
                    int i = 0;
                    while (i < 10) {
                        sum = sum + i;
                        i = i + 1;
                    }
                    printf("%d", sum);
                }""";

        String obfuscated = obfuscateCode(input);

        // Print for debugging
        System.out.println("Original code:\n" + input);
        System.out.println("Obfuscated code:\n" + obfuscated);

        // Verify syntactic validity
        try {
            var lexer = new MinicLexer(CharStreams.fromString(obfuscated));
            var parser = new MinicParser(new CommonTokenStream(lexer));
            var tree = parser.program();
            assertNotNull("Parser should produce a valid parse tree", tree);
        } catch (Exception e) {
            fail("Obfuscation should produce valid syntax: " + e.getMessage());
        }
    }

    @Test
    public void testNestedBlocksDeadCode() {
        String input = """
                void main() {
                    if (1 > 0) {
                        if (2 > 1) {
                            int x = 10;
                        }
                    }
                }""";

        String obfuscated = obfuscateCode(input);

        // Print for debugging
        System.out.println("Original code:\n" + input);
        System.out.println("Obfuscated code:\n" + obfuscated);

        // Check that dead code was inserted and original structure preserved
        assertTrue("Should contain dummy variables", obfuscated.contains("_dummy"));
        assertTrue("Should preserve nested if conditions",
                obfuscated.contains("if (1 > 0)") && obfuscated.contains("if (2 > 1)"));
    }

    private String obfuscateCode(String source) {
        var lexer = new MinicLexer(CharStreams.fromString(source));
        var tokens = new CommonTokenStream(lexer);
        var parser = new MinicParser(tokens);
        var tree = parser.program();

        return DeadCodeInserter.insertDeadCode(tree, tokens);
    }
}