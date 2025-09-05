package com.github.techniques.deObfuscate.expression;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

// We extend MinicBaseListener to hook into the parse tree walking process.
public class ExpressionSimplifier extends MinicBaseListener {

    private final TokenStreamRewriter rewriter;

    /**
     * Constructor for the ExpressionSimplifier.
     *
     * @param tokens The token stream from the lexer, which is needed for rewriting.
     */
    public ExpressionSimplifier(TokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
    }

    /**
     * This method is called by the ParseTreeWalker after it has visited the children
     * of a binary operation node. This is the perfect place to check for patterns
     * we want to simplify.
     *
     * @param ctx The context object for the binary operation rule.
     */
    @Override
    public void exitBinaryOperation(MinicParser.BinaryOperationContext ctx) {
        // We are looking for a very specific pattern: a subtraction operator '-'
        // where the right-hand side is a unary minus operation.
        // Example: a - (-b) or a - b

        // 1. Check if the operator is a minus sign.
        if (ctx.op.getType() != MinicParser.MINUS) {
            return; // Not a subtraction, so we don't care about it.
        }

        // 2. Unwrap any parentheses on the right-hand side to get to the core expression.
        MinicParser.ExpressionContext rightExpr = unwrapParentheses(ctx.right);

        // 3. Check if the unwrapped expression is a Unary Operation.
        if (!(rightExpr instanceof MinicParser.UnaryOperationContext)) {
            return; // Right side is not a unary operation, so nothing to simplify here.
        }

        // 4. If it is a Unary Operation, check if its operator is also a minus sign.
        MinicParser.UnaryOperationContext rightUnaryOp = (MinicParser.UnaryOperationContext) rightExpr;
        if (rightUnaryOp.op.getType() == MinicParser.MINUS) {
            // Pattern matched! We have `left - (...(-right_expression)...)`.
            // Now, we perform the rewrite.

            System.out.println("Simplifying expression: " + ctx.getText());

            // a. Replace the binary minus operator with a plus.
            rewriter.replace(ctx.op, "+");

            // b. Replace the entire right-hand expression (including any parentheses
            // and the unary minus) with just the inner expression itself.
            MinicParser.ExpressionContext innerExpr = rightUnaryOp.expression();
            rewriter.replace(ctx.right.start, ctx.right.stop, innerExpr.getText());


            System.out.println("Rewritten to: " + getRewrittenText(ctx));
        }
    }

    /**
     * A helper method to recursively unwrap nested parentheses from an expression context.
     * This allows us to check the actual operation inside, e.g., getting to `-5`
     * from `(-5)` or `(((-5)))`.
     *
     * @param ctx The expression context, which might be a ParenthesesExpressionContext.
     * @return The innermost expression context that is not a ParenthesesExpressionContext.
     */
    private MinicParser.ExpressionContext unwrapParentheses(MinicParser.ExpressionContext ctx) {
        while (ctx instanceof MinicParser.ParenthesesExpressionContext) {
            ctx = ((MinicParser.ParenthesesExpressionContext) ctx).parExpression().expression();
        }
        return ctx;
    }

    /**
     * A helper method to get the rewritten text for a specific parse tree node.
     * This is useful for debugging and seeing the result of a specific rule.
     */
    private String getRewrittenText(ParseTree tree) {
        return rewriter.getText(
                tree.getSourceInterval()
        );
    }


    /**
     * Call this method after walking the tree to get the fully de-obfuscated code.
     *
     * @return The modified code as a string.
     */
    public String getRewrittenCode() {
        return rewriter.getText();
    }
}
