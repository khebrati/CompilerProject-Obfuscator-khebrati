package com.github.techniques.renamer;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
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

        String varChangedCode = VariableRenamer.renameVar(tree, tokens);

        System.out.println(varChangedCode);
    }

    @Test
    public void changesFunctionNames() {
        String program = "int doSthFunction(){ int y = 5 + 8;}";
        var lexer = new MinicLexer(CharStreams.fromString(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        var funRenamedCode = VariableRenamer.renameVar(parser.program(), tokens);
        System.out.println(funRenamedCode);
    }

    @Test
    public void changesFunctionNamesWithRef() {
        String program = "int anotherFunction(int a, double b){ " +
                "int b = 8 + 9;" +
                "return b;" +
                " }" +
                "int main(){" +
                "anotherFunction(3,4);" +
                "}";
        var lexer = new MinicLexer(CharStreams.fromString(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        var funRenamedCode = VariableRenamer.renameVar(parser.program(), tokens);
        System.out.println(funRenamedCode);
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

    @Test
    public void mainFunWithoutFunctions() {
        String program = "int main(){\n" +
                "    int a = 2 + 3;\n" +
                "}";
        var lexer = new MinicLexer(CharStreams.fromString(program));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        var funRenamedCode = VariableRenamer.renameVar(parser.program(), tokens);
        System.out.println(funRenamedCode);
    }
}