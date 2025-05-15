package com.github.techniques.expression;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class ExpressionRewriter extends MinicBaseListener {
    private static final Random random = new Random();
    private final TokenStreamRewriter rewriter;
    private final CommonTokenStream tokens;

    private static final List<String> COMPLEX_PATTERNS = Arrays.asList(
            "(%s - (-%s))",
            "((%s * 3 + %s * 3) / 3)",
            "((%s * 2 - (-%s * 2)) / 2)",
            "((%s * 4 + %s * 4) / 4)",
            "(((%s + %s) * 2) / 2)",
            "((%s + 0) + (%s + 0))",
            "((%s * 2 + %s * 2) / 2)",
            "(((%s + 1) + (%s - 1)))",
            "((%s + %s + 7 - 7))",
            "(((%s * 5) + (%s * 5)) / 5)"
    );

    public ExpressionRewriter(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String text = tokens.getText(ctx);
        if (!text.contains("+") && !text.contains("-") && !text.contains("*")) {
            return;
        }

        // Process all children to find expressions
        for (int i = 0; i < ctx.getChildCount() - 2; i++) {
            Token left = null;
            Token operator = null;
            Token right = null;

            // Look for arithmetic patterns
            try {
                if (ctx.getChild(i + 1) instanceof TerminalNode &&
                        isOperator(ctx.getChild(i + 1).getText())) {

                    // Get left operand
                    if (ctx.getChild(i) instanceof TerminalNode) {
                        left = ((TerminalNode) ctx.getChild(i)).getSymbol();
                    } else if (ctx.getChild(i) instanceof ParserRuleContext) {
                        left = ((ParserRuleContext) ctx.getChild(i)).getStart();
                    }

                    // Get operator
                    operator = ((TerminalNode) ctx.getChild(i + 1)).getSymbol();

                    // Get right operand
                    if (ctx.getChild(i + 2) instanceof TerminalNode) {
                        right = ((TerminalNode) ctx.getChild(i + 2)).getSymbol();
                    } else if (ctx.getChild(i + 2) instanceof ParserRuleContext) {
                        right = ((ParserRuleContext) ctx.getChild(i + 2)).getStart();
                    }

                    if (left != null && operator != null && right != null) {
                        transformExpression(left, operator, right);
                    }
                }
            } catch (Exception e) {
                continue; // Skip if any error occurs during processing
            }
        }
    }

    private void transformExpression(Token left, Token operator, Token right) {
        // Get the complete text for each operand
        String leftText = getCompleteText(left);
        String rightText = getCompleteText(right);

        // Always transform (100% probability)
        String pattern = COMPLEX_PATTERNS.get(random.nextInt(COMPLEX_PATTERNS.size()));
        String replacement = String.format(pattern, leftText, rightText);

        try {
            // Find the real start and stop tokens
            int startIndex = getStartIndex(left);
            int stopIndex = getStopIndex(right);

            rewriter.replace(startIndex, stopIndex, replacement);
        } catch (IllegalArgumentException e) {
            // Skip if replacement would cause overlap
        }
    }

    private String getCompleteText(Token token) {
        if (token instanceof CommonToken) {
            return token.getText();
        } else {
            // If it's a context, get the full text
            int start = token.getStartIndex();
            int stop = token.getStopIndex();
            if (start >= 0 && stop >= 0 && stop >= start) {
                return tokens.getText(Interval.of(start, stop));
            }
            return token.getText();
        }
    }

    private int getStartIndex(Token token) {
        if (token instanceof CommonToken) {
            return token.getTokenIndex();
        }
        return token.getStartIndex();
    }

    private int getStopIndex(Token token) {
        if (token instanceof CommonToken) {
            return token.getTokenIndex();
        }
        return token.getStopIndex();
    }

    private boolean isOperator(String text) {
        return text.equals("+") || text.equals("-") || text.equals("*");
    }

    public String getObfuscatedCode() {
        return rewriter.getText();
    }

    public static String rewriteExpressions(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        ExpressionRewriter rewriter = new ExpressionRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(rewriter, tree);
        return rewriter.getObfuscatedCode();
    }
}