package com.github.techniques.inliner;


import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

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

    @Test
    public void mainFunWithoutFunctions() {
        String program = "int main(){\n" +
                "    int a = 2 + 3;\n" +
                "}";
        var lexer = new MinicLexer(CharStreams.fromString(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        var inlined = Inliner.inlineFunctions(parser.program(), tokens);
        System.out.println(inlined);
    }


}