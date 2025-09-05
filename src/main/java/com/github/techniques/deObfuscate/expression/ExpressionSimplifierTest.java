package com.github.techniques.deObfuscate.expression;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import junit.framework.TestCase;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;

public class ExpressionSimplifierTest extends TestCase {
    public void testExpression(){
        String expression = "x = a + b - c * d / e - f;";
        String simplified = getSimplified(expression);
        System.out.println(simplified);
    }
    public void testParseOperations_givenSampleExpression_replacesIdWithPrime(){
        String expression = "a+b-c*d/e-f";
        var parser = new OperatorParser();
        var replaced = parser.parseOperators(expression);
        assertEquals("7867+7873-7877*7879/7883-7901", replaced.content());
    }
    public void testParseOperations_givenExpressionWithCoeff_replacesIdWithPrime(){
        String expression = "3*a+b-4*c*d/5*e-2*f";
        var parser = new OperatorParser();
        var replaced = parser.parseOperators(expression);
        assertEquals("3*7867+7873-4*7877*7879/5*7883-2*7901", replaced.content());
    }

    public void testParseOperations_givenSampleExpression_returnsCorrectSetOfOperators(){
        String expression = "3*a+b-4*c*d/5*e-2*f";
        var parser = new OperatorParser();
        var replaced = parser.parseOperators(expression);
        System.out.println(replaced.content());
    }
    public void testExpressionRunner(){
        var result = ExpressionRunner.runExpression("7867+7873-7877*7879/7883-7901");
        assertEquals(-34,result);
    }

    public void testParseId(){
        String expression = "x = a + b - c * d / e - f;";
        String parsed = getSimplified(expression);
    }
    private String getSimplified(String code) {
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(code));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        MinicParser.ProgramContext tree = parser.program();
        return ExpressionSimplifier.simplifyExpression(tree, tokens).trim();
    }
}

