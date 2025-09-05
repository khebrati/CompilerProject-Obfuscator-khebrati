package com.github.techniques.deObfuscate.expression;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;


/**
 * A listener that walks the ANTLR parse tree and applies simplification rules
 * to de-obfuscate expressions. It uses a TokenStreamRewriter to modify the code.
 */
public class ExpressionSimplifier extends MinicBaseListener {

    private final TokenStreamRewriter rewriter;
    // This map stores the computed integer value of constant expression subtrees.
    // It's the key to enabling more advanced simplifications.
    private final Map<ParseTree, Integer> constantValues = new HashMap<>();

    public ExpressionSimplifier(TokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
    }

    /**
     * After visiting a literal, if it's an integer, we store its value.
     * This is the first step of constant folding.
     */
    @Override
    public void exitLiteralExpression(MinicParser.LiteralExpressionContext ctx) {
        if (ctx.literal() instanceof MinicParser.IntContext) {
            try {
                constantValues.put(ctx, Integer.parseInt(ctx.getText()));
            } catch (NumberFormatException e) {
                // Ignore non-integer literals
            }
        }
    }

    /**
     * After visiting a unary operation, we check if we can fold it.
     * For example, if we know the value of '5', we can compute the value of '-5'.
     */
    @Override
    public void exitUnaryOperation(MinicParser.UnaryOperationContext ctx) {
        if (ctx.op.getType() == MinicParser.MINUS) {
            Integer value = constantValues.get(ctx.expression());
            if (value != null) {
                int result = -value;
                constantValues.put(ctx, result);
                rewriter.replace(ctx.start, ctx.stop, String.valueOf(result));
            }
        }
    }

    /**
     * This is the core simplification logic. It's called after visiting any binary operation.
     * It attempts to apply simplification rules in order of complexity.
     */
    @Override
    public void exitBinaryOperation(MinicParser.BinaryOperationContext ctx) {
        // --- RULE 1: Constant Folding ---
        // If both sides of the operator are known constants, we can compute the result now.
        if (tryConstantFolding(ctx)) {
            return; // The node was simplified to a single number, no more rules apply.
        }

        // --- RULE 2: Simplify Subtraction of a Negative ---
        // This handles cases like `a - (-b)` and turns them into `a + b`.
        if (trySimplifyingSubtraction(ctx)) {
            return; // The node was simplified, stop processing.
        }

        // --- RULE 3: Simplify Distributive Property over Division ---
        // This is the most complex rule, handling patterns like `(a*c - b*c) / c`.
        trySimplifyingDistributiveDivision(ctx);
    }

    /**
     * Attempts to evaluate a binary operation if both operands are constant integers.
     * @return true if the expression was folded, false otherwise.
     */
    private boolean tryConstantFolding(MinicParser.BinaryOperationContext ctx) {
        Integer leftVal = getConstantValue(ctx.left);
        Integer rightVal = getConstantValue(ctx.right);

        if (leftVal != null && rightVal != null) {
            int result = 0;
            boolean calculated = true;
            switch (ctx.op.getType()) {
                case MinicParser.PLUS: result = leftVal + rightVal; break;
                case MinicParser.MINUS: result = leftVal - rightVal; break;
                case MinicParser.MUL: result = leftVal * rightVal; break;
                case MinicParser.DIV:
                    if (rightVal != 0) result = leftVal / rightVal;
                    else calculated = false; // Avoid division by zero
                    break;
                default: calculated = false;
            }

            if (calculated) {
                constantValues.put(ctx, result);
                rewriter.replace(ctx.start, ctx.stop, String.valueOf(result));
                return true;
            }
        }
        return false;
    }

    /**
     * Simplifies expressions of the form `a - (-b)` to `a + b`.
     * @return true if a simplification was performed, false otherwise.
     */
    private boolean trySimplifyingSubtraction(MinicParser.BinaryOperationContext ctx) {
        if (ctx.op.getType() == MinicParser.MINUS) {
            MinicParser.ExpressionContext rightCoreExpr = unwrapParentheses(ctx.right);
            if (rightCoreExpr instanceof MinicParser.UnaryOperationContext) {
                MinicParser.UnaryOperationContext rightUnaryOp = (MinicParser.UnaryOperationContext) rightCoreExpr;
                if (rightUnaryOp.op.getType() == MinicParser.MINUS) {
                    rewriter.replace(ctx.op, "+");
                    rewriter.replace(ctx.right.start, ctx.right.stop, rightUnaryOp.expression().getText());
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Simplifies expressions of the form `((a*c) op (b*c)) / c` to `a op b`.
     * This handles the complex case from the unit test by evaluating the final operation.
     */
    private void trySimplifyingDistributiveDivision(MinicParser.BinaryOperationContext ctx) {
        if (ctx.op.getType() != MinicParser.DIV) return;

        // Divisor C must be a non-zero constant.
        Integer C = getConstantValue(ctx.right);
        if (C == null || C == 0) return;

        MinicParser.ExpressionContext dividend = unwrapParentheses(ctx.left);
        if (!(dividend instanceof MinicParser.BinaryOperationContext)) return;
        MinicParser.BinaryOperationContext topBinOp = (MinicParser.BinaryOperationContext) dividend;

        // We expect (L op R) / C
        MinicParser.ExpressionContext L = unwrapParentheses(topBinOp.left);
        MinicParser.ExpressionContext R = unwrapParentheses(topBinOp.right);

        if (!(L instanceof MinicParser.BinaryOperationContext) || !(R instanceof MinicParser.BinaryOperationContext)) return;
        MinicParser.BinaryOperationContext leftMult = (MinicParser.BinaryOperationContext) L;
        MinicParser.BinaryOperationContext rightMult = (MinicParser.BinaryOperationContext) R;

        // Check if L is A * C
        if (leftMult.op.getType() != MinicParser.MUL || !C.equals(getConstantValue(leftMult.right))) return;
        String A_text = leftMult.left.getText();

        // Check if R is B * C
        if (rightMult.op.getType() != MinicParser.MUL || !C.equals(getConstantValue(rightMult.right))) return;

        // At this point, the pattern `((A*C) op (B*C)) / C` is matched.
        // We can now build the simplified expression: `A op B`

        String op_text = topBinOp.op.getText();
        Integer B_val = getConstantValue(rightMult.left);
        String B_text;

        if (B_val != null) {
            B_text = B_val.toString();
        } else {
            B_text = rightMult.left.getText();
        }

        String replacement;

        // Simplify the operation `A op B` based on the operator and whether B is a negative constant
        if (op_text.equals("-")) {
            if (B_val != null && B_val < 0) {
                // A - (-B_abs)  => A + B_abs
                replacement = String.format("%s + %d", A_text, Math.abs(B_val));
            } else {
                // A - B
                replacement = String.format("%s - %s", A_text, B_text);
            }
        } else if (op_text.equals("+")) {
            if (B_val != null && B_val < 0) {
                // A + (-B_abs) => A - B_abs
                replacement = String.format("%s - %d", A_text, Math.abs(B_val));
            } else {
                // A + B
                replacement = String.format("%s + %s", A_text, B_text);
            }
        } else {
            // For other ops like '*' or '/'
            replacement = String.format("%s %s %s", A_text, op_text, B_text);
        }

        rewriter.replace(ctx.start, ctx.stop, replacement);
    }


    /**
     * Helper to get a pre-computed constant value for an expression, unwrapping any parentheses.
     */
    private Integer getConstantValue(MinicParser.ExpressionContext ctx) {
        return constantValues.get(unwrapParentheses(ctx));
    }

    /**
     * Recursively unwraps nested parentheses from an expression context to get the core expression.
     */
    private MinicParser.ExpressionContext unwrapParentheses(MinicParser.ExpressionContext ctx) {
        while (ctx instanceof MinicParser.ParenthesesExpressionContext) {
            ctx = ((MinicParser.ParenthesesExpressionContext) ctx).parExpression().expression();
        }
        return ctx;
    }

    /**
     * Returns the fully rewritten code after the parse tree walk is complete.
     */
    public String getRewrittenCode() {
        return rewriter.getText();
    }
}