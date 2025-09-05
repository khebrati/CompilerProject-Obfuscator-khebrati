package com.github.techniques.obfuscate.expression;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.Random;

public class ExpressionObfuscator extends MinicBaseListener {
    private static final Random random = new Random();
    private final TokenStreamRewriter rewriter;

    private static final String[] COMPLEX_PATTERNS = {
            "(%s - (-%s))",                          // a + b -> (a - (-b))
            "((%s * 3) - (-%s * 3)) / 3",           // More complex equivalent
            "((%s * 2) - (-%s * 2)) / 2",           // Using multiplication
            "(%s - ((%s * -1)))"                     // Using negation
    };

    public ExpressionObfuscator(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        if (ctx.getChildCount() < 3) return;

        for (int i = 0; i < ctx.getChildCount() - 2; i++) {
            if (ctx.getChild(i + 1).getText().equals("+")) {
                try {
                    String left = ctx.getChild(i).getText();
                    String right = ctx.getChild(i + 2).getText();

                    String pattern = COMPLEX_PATTERNS[random.nextInt(COMPLEX_PATTERNS.length)];
                    String replacement = String.format(pattern, left, right);

                    Token start = ctx.getChild(i).getPayload() instanceof Token ?
                            (Token) ctx.getChild(i).getPayload() :
                            ((ParserRuleContext) ctx.getChild(i)).getStart();
                    Token end = ctx.getChild(i + 2).getPayload() instanceof Token ?
                            (Token) ctx.getChild(i + 2).getPayload() :
                            ((ParserRuleContext) ctx.getChild(i + 2)).getStop();

                    rewriter.replace(start, end, replacement);
                } catch (Exception e) {
                    // Skip if transformation fails
                }
            }
        }
    }

    public String getObfuscatedCode() {
        return rewriter.getText();
    }

    public static String rewriteExpressions(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        ExpressionObfuscator expressionObfuscator = new ExpressionObfuscator(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(expressionObfuscator, tree);
        return expressionObfuscator.getObfuscatedCode();
    }
}