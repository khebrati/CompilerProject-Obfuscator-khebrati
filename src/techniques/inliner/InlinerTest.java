package techniques.inliner;


import gen.MinicLexer;
import gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class InlinerTest {

    @Test
    public void variableNamesAreChanged() {
        String program = "int doSthFunction(){}";
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        MinicParser.ProgramContext tree = parser.program();

        String inlined = Inliner.inlineFunctions(tree, tokens);

        System.out.println(inlined);
    }
}