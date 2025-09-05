package com.github.techniques.deObfuscate.rename;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the VariableRenamer class.
 * These tests confirm that 'main' is not renamed, and variables
 * are correctly prefixed with their types.
 */
public class VariableRenamerTest {

    @Test
    public void testBasicFunctionAndVariableRenaming() {
        String code = "int fxz(int x1, int x2) { int a39 = x1 - x2; return a39; }";
        String expected = "int func1(int int_var1, int int_var2) { int int_var3 = int_var1 - int_var2; return int_var3; }";
        String actual = VariableRenamer.rename(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testMainFunctionIsNotRenamed() {
        String code = "int main() { int my_var = 5; }";
        String expected = "int main() { int int_var1 = 5; }";
        String actual = VariableRenamer.rename(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testMultipleFunctionsAndGlobalScope() {
        String code = "int obf_func1(int p1) { return p1; } int main() { int my_var = 5; obf_func1(my_var); }";
        String expected = "int func1(int int_var1) { return int_var1; } int main() { int int_var2 = 5; func1(int_var2); }";
        String actual = VariableRenamer.rename(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testNestedScopesWithShadowing() {
        String code = "int main() { int x = 1; if (x > 0) { int x = 2; } return x; }";
        String expected = "int main() { int int_var1 = 1; if (int_var1 > 0) { int int_var2 = 2; } return int_var1; }";
        String actual = VariableRenamer.rename(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testVariableUsageIsCorrectlyRenamed() {
        String code = "int main() { int a_very_long_name = 10; a_very_long_name = a_very_long_name + 5; }";
        String expected = "int main() { int int_var1 = 10; int_var1 = int_var1 + 5; }";
        String actual = VariableRenamer.rename(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testNoVariablesToRename() {
        String code = "int main() { return 0; }";
        String expected = "int main() { return 0; }";
        String actual = VariableRenamer.rename(code);
        assertEquals(expected, actual.trim());
    }

    @Test
    public void testRenamingWithMultipleTypes() {
        String code = "string func(int i, bool b) { string s = \"hello\"; return s; } int main() { func(1, true); }";
        String expected = "string func1(int int_var1, bool bool_var2) { string string_var3 = \"hello\"; return string_var3; } int main() { func1(1, true); }";
        String actual = VariableRenamer.rename(code);
        assertEquals(expected, actual.trim());
    }
}

