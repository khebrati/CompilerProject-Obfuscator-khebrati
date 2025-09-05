package com.github.techniques.deObfuscate.expression;

import bsh.Interpreter;

public class ExpressionRunner {
    public static int runExpression(String expression) {
        var interpreter = new Interpreter();
        try {
            return (int)interpreter.eval(expression);
        }catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
