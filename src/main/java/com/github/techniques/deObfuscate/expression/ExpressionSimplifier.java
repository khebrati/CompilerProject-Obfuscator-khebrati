package com.github.techniques.deObfuscate.expression;

import bsh.Interpreter;
import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;

public class ExpressionSimplifier extends MinicBaseListener {
    public final TokenStreamRewriter rewriter;
    private OperatorParser operatorParser = new OperatorParser();
    private ArrayList idInfoList = new ArrayList();

    public ExpressionSimplifier(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterAssignBody(MinicParser.AssignBodyContext ctx) {
        var expressionText = ctx.expression().getText();
        var replacedExpression = operatorParser.parseOperators(expressionText);
        replacedExpression.content();
        rewriter.replace(ctx.expression().getStart(), ctx.expression().getStop(), replacedExpression.content());
    }



    public String getResults() {
        return rewriter.getText();
    }


    public static String simplifyExpression(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        var simplifier = new ExpressionSimplifier(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(simplifier, tree);
        return simplifier.getResults();
    }
}


