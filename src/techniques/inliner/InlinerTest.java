package techniques.inliner;


import gen.MinicLexer;
import gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class InlinerTest {

    @Test
    public void inlines() {
        String program = "int add(int a, int b){" +
                "int c = a + b;" +
                "return c;" +
                "}" +
                "add(4,5);";
        var inlined = inline(program);
        System.out.println(inlined);
    }

    private String inline(String program) {
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        MinicParser.ProgramContext tree = parser.program();
        return Inliner.inlineFunctions(tree, tokens);
    }

    @Test
    public void simpleMainTest(){
        String program = "int main(){" +
                "}";
        var inlined = inline(program);
        System.out.println(inlined);
    }


}