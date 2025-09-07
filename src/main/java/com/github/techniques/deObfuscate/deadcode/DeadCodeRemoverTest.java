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
        return DeadCodeRemover.removeDeadCode(tree, tokens).trim();
    }

    @Test
    public void testUnusedVariableRemoval() {
        String input = "int x = 5;\nint unused = 10;\nprint(x);";
        String output = removeDeadCode(input);
        assertTrue("Should keep used variable x", output.contains("x = 5"));
        assertFalse("Should remove unused variable", output.contains("unused"));
    }

    @Test
    public void testCodeAfterReturn() {
        String input =
                "{\n" +
                        "    int x = 5;\n" +
                        "    return x;\n" +
                        "    print(x);\n" +
                        "}";
        String output = removeDeadCode(input);
        assertTrue("Should keep return statement", output.contains("return x"));
        assertFalse("Should remove code after return", output.contains("print(x)"));
    }

    @Test
    public void testEmptyBlockRemoval() {
        String input = "if (x > 0) { }\nwhile (y < 10) {\n}\n";
        String output = removeDeadCode(input);
        assertFalse("Should remove empty blocks", output.contains("{ }"));
        assertFalse("Should remove empty blocks with newlines", output.contains("{\n}"));
    }

    @Test
    public void testComplexCase() {
        String input =
                "int main() {\n" +
                        "    int x = 5;\n" +
                        "    int unused = 10;\n" +
                        "    if (x > 0) {\n" +
                        "        return x;\n" +
                        "        print(unused);\n" +
                        "    }\n" +
                        "    print(x);\n" +
                        "}";

        String output = removeDeadCode(input);

        assertTrue("Should keep main function", output.contains("int main()"));
        assertTrue("Should keep used variable x", output.contains("x = 5"));
        assertFalse("Should remove unused variable", output.contains("unused = 10"));
        assertTrue("Should keep return statement", output.contains("return x"));
        assertFalse("Should remove code after return", output.contains("print(unused)"));
    }

    @Test
    public void testNestedBlocks() {
        String input =
                "{\n" +
                        "    int x = 1;\n" +
                        "    {\n" +
                        "        return x;\n" +
                        "        {\n" +
                        "            print(x);\n" +
                        "        }\n" +
                        "    }\n" +
                        "}";

        String output = removeDeadCode(input);
        assertTrue("Should keep outer block", output.contains("{"));
        assertTrue("Should keep variable declaration", output.contains("x = 1"));
        assertTrue("Should keep return statement", output.contains("return x"));
        assertFalse("Should remove nested block after return", output.contains("print(x)"));
    }
}