package com.github.techniques.deObfuscate.rename;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the VariableRenamer class.
 * These tests confirm that variables are renamed to alphabetical characters.
 */
public class NameSimplifierTest {

    /**
     * Helper method that performs the ANTLR parsing and then calls the
     * renamer with the generated tree and token stream.
     *
     * @param code The source code to process.
     * @return The rewritten code.
     */
    private String renameCode(String code) {
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(code));
        var tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        MinicParser.ProgramContext tree = parser.program();

        // Call the static rename method with the pre-built tree and tokens
        return NameSimplifier.rename(tree, tokens);
    }

    @Test
    public void testBasicFunctionAndVariableRenaming() {
        String code = "int fxz(int x1, int x2) { int a39 = x1 - x2; return a39; }";
        // Parameters x1, x2 become a, b. Local var a39 becomes c.
        String expected = "int func1(int a, int b) { int c = a - b; return c; }";
        String actual = renameCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testMainFunctionIsNotRenamed() {
        String code = "int main() { int my_var = 5; }";
        String expected = "int main() { int a = 5; }";
        String actual = renameCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testMultipleFunctionsAndGlobalScope() {
        String code = "int obf_func1(int p1) { return p1; } int main() { int my_var = 5; obf_func1(my_var); }";
        // p1 -> a, my_var -> b
        String expected = "int func1(int a) { return a; } int main() { int b = 5; func1(b); }";
        String actual = renameCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testNestedScopesWithShadowing() {
        String code = "int main() { int x = 1; if (x > 0) { int x = 2; } return x; }";
        // outer x -> a, inner x -> b
        String expected = "int main() { int a = 1; if (a > 0) { int b = 2; } return a; }";
        String actual = renameCode(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testAlphabeticalRollover() {
        // Create 27 variables to test rollover from 'z' to 'aa'
        String code = "int main() { int v0;int v1;int v2;int v3;int v4;int v5;int v6;int v7;int v8;int v9;int v10;int v11;int v12;int v13;int v14;int v15;int v16;int v17;int v18;int v19;int v20;int v21;int v22;int v23;int v24;int v25;int v26;}";
        String expected = "int main() { int a;int b;int c;int d;int e;int f;int g;int h;int i;int j;int k;int l;int m;int n;int o;int p;int q;int r;int s;int t;int u;int v;int w;int x;int y;int z;int aa;}";
        String actual = renameCode(code);
        assertEquals(expected, actual.trim());
    }
}

