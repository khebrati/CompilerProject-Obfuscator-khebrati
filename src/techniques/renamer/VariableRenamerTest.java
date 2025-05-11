package techniques.renamer;

import gen.MinicLexer;
import gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import static org.junit.Assert.*;

public class VariableRenamerTest {
    @Test
        public void variableNamesAreChanged() {
            String program = "int x = 10; x = x + 1;";
            MinicLexer lexer = new MinicLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinicParser parser = new MinicParser(tokens);
            MinicParser.ProgramContext tree = parser.program();

            String variableRenamedCode = VariableRenamer.renameVar(tree, tokens);

            assertNotEquals("Variable names should be changed", program, variableRenamedCode);
            System.out.println(variableRenamedCode);
        }

        @Test
        public void handlesNoVariableDeclarations() {
            String program = "println(\"Hello, World!\");";
            MinicLexer lexer = new MinicLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinicParser parser = new MinicParser(tokens);
            MinicParser.ProgramContext tree = parser.program();

            String MiniccatedCode = VariableRenamer.renameVar(tree, tokens);

            assertEquals("Code without variables should remain unchanged", program, MiniccatedCode);
        }

        @Test
        public void handlesMultipleVariableDeclarations() {
            String program = "int a = 5; int b = 10; a = b + a;";
            MinicLexer lexer = new MinicLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinicParser parser = new MinicParser(tokens);
            MinicParser.ProgramContext tree = parser.program();

            String MiniccatedCode = VariableRenamer.renameVar(tree, tokens);

            System.out.println(MiniccatedCode);
        }


        @Test
        public void handlesEmptyProgram() {
            String program = "";
            MinicLexer lexer = new MinicLexer(CharStreams.fromString(program));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinicParser parser = new MinicParser(tokens);
            MinicParser.ProgramContext tree = parser.program();

            String MiniccatedCode = VariableRenamer.renameVar(tree, tokens);

            assertEquals("Empty program should remain unchanged", program, MiniccatedCode);
        }
}