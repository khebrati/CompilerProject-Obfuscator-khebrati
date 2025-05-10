import static org.junit.Assert.*;
import org.junit.Test;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import gen.ObfusLexer;
import gen.ObfusParser;

public class BaseParsingTest {

    @Test
    public void testBasicParsing() {
        // Sample program to parse
        String program =
                "int x = 5;\n" +
                        "if (x > 3) {\n" +
                        "  println(\"x is greater than 3\");\n" +
                        "} else {\n" +
                        "  println(\"x is not greater than 3\");\n" +
                        "}\n";

        var lexer = new ObfusLexer(CharStreams.fromString(program));
        var tokens = new CommonTokenStream(lexer);
        var parser = new ObfusParser(tokens);

        ObfusParser.ProgramContext tree = parser.program();

        // Basic assertions
        assertNotNull("Parse tree should not be null", tree);
        assertEquals("There should be no syntax errors", 0, parser.getNumberOfSyntaxErrors());
    }

    @Test
    public void testSyntaxErrorProgram(){
        String program = "if(a > 2)";
        var lexer = new ObfusLexer(CharStreams.fromString(program));
        var tokens = new CommonTokenStream(lexer);
        var parser = new ObfusParser(tokens);

        var tree = parser.program();
        assertEquals(1, parser.getNumberOfSyntaxErrors());
    }

    @Test
    public void testVariableDeclaration() {
        var input = "int x = 10;";

        ObfusLexer lexer = new ObfusLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ObfusParser parser = new ObfusParser(tokens);

        ObfusParser.ProgramContext tree = parser.program();

        assertNotNull(tree);
        assertEquals(0, parser.getNumberOfSyntaxErrors());
    }
}
