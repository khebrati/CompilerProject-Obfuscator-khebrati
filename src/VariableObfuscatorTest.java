import gen.ObfusLexer;
import gen.ObfusParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import static org.junit.Assert.*;

public class VariableObfuscatorTest {
    @Test
        public void variableNamesAreObfuscated() {
            String program = "int x = 10; x = x + 1;";
            ObfusLexer lexer = new ObfusLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ObfusParser parser = new ObfusParser(tokens);
            ObfusParser.ProgramContext tree = parser.program();

            String obfuscatedCode = VariableObfuscator.Obfuscate(tree, tokens);

            assertNotEquals("Variable names should be changed", program, obfuscatedCode);
            System.out.println(obfuscatedCode);
        }

        @Test
        public void handlesNoVariableDeclarations() {
            String program = "println(\"Hello, World!\");";
            ObfusLexer lexer = new ObfusLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ObfusParser parser = new ObfusParser(tokens);
            ObfusParser.ProgramContext tree = parser.program();

            String obfuscatedCode = VariableObfuscator.Obfuscate(tree, tokens);

            assertEquals("Code without variables should remain unchanged", program, obfuscatedCode);
        }

        @Test
        public void handlesMultipleVariableDeclarations() {
            String program = "int a = 5; int b = 10; a = b + a;";
            ObfusLexer lexer = new ObfusLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ObfusParser parser = new ObfusParser(tokens);
            ObfusParser.ProgramContext tree = parser.program();

            String obfuscatedCode = VariableObfuscator.Obfuscate(tree, tokens);

            System.out.println(obfuscatedCode);
        }


        @Test
        public void handlesEmptyProgram() {
            String program = "";
            ObfusLexer lexer = new ObfusLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ObfusParser parser = new ObfusParser(tokens);
            ObfusParser.ProgramContext tree = parser.program();

            String obfuscatedCode = VariableObfuscator.Obfuscate(tree, tokens);

            assertEquals("Empty program should remain unchanged", program, obfuscatedCode);
        }
}