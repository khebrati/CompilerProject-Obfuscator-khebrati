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
        if (tryConstantFolding(ctx)) {
            return;
        }

        // --- RULE 2: Identity Multiplication (e.g., 1 * x => x) ---
        if (trySimplifyIdentityMultiplication(ctx)) {
            // Note: In a multi-pass system, this would trigger another round.
            // In a single pass, we can't always chain simplifications, but this is a useful rule.
        }

        // --- RULE 3: Simplify Subtraction of a Negative ---
        if (trySimplifyingSubtraction(ctx)) {
            return;
        }

        // --- RULE 4: Simplify Subtraction of a Negative Product ---
        if (trySimplifySubtractionOfNegativeProduct(ctx)) {
            return;
        }

        // --- RULE 5: Simplify Distributive Property over Division ---
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
     * Simplifies identity multiplications, e.g., (1 * x) => x or (x * 1) => x.
     * @return true if a simplification was performed, false otherwise.
     */
    private boolean trySimplifyIdentityMultiplication(MinicParser.BinaryOperationContext ctx) {
        if (ctx.op.getType() != MinicParser.MUL) {
            return false;
        }

        Integer leftVal = getConstantValue(ctx.left);
        Integer rightVal = getConstantValue(ctx.right);

        // Case 1: (1 * X). Replace the whole expression with X.
        if (leftVal != null && leftVal == 1) {
            rewriter.replace(ctx.start, ctx.stop, ctx.right.getText());
            if (rightVal != null) {
                constantValues.put(ctx, rightVal);
            }
            return true;
        }

        // Case 2: (X * 1). Replace the whole expression with X.
        if (rightVal != null && rightVal == 1) {
            rewriter.replace(ctx.start, ctx.stop, ctx.left.getText());
            if (leftVal != null) {
                constantValues.put(ctx, leftVal);
            }
            return true;
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
     * Simplifies expressions of the form A - (B * -C) or A - (-B * C).
     * This transforms the expression into A + (B * C) and simplifies identity multiplications.
     * @return true if a simplification was performed, false otherwise.
     */
    private boolean trySimplifySubtractionOfNegativeProduct(MinicParser.BinaryOperationContext ctx) {
        if (ctx.op.getType() != MinicParser.MINUS) {
            return false;
        }

        MinicParser.ExpressionContext rightExpr = unwrapParentheses(ctx.right);
        if (!(rightExpr instanceof MinicParser.BinaryOperationContext)) {
            return false;
        }

        MinicParser.BinaryOperationContext product = (MinicParser.BinaryOperationContext) rightExpr;
        if (product.op.getType() != MinicParser.MUL) {
            return false;
        }

        MinicParser.ExpressionContext productLeft = unwrapParentheses(product.left);
        MinicParser.ExpressionContext productRight = unwrapParentheses(product.right);

        String B_text = null;
        String C_text = null;
        boolean matched = false;

        if (productRight instanceof MinicParser.UnaryOperationContext &&
                ((MinicParser.UnaryOperationContext) productRight).op.getType() == MinicParser.MINUS) {
            B_text = productLeft.getText();
            C_text = ((MinicParser.UnaryOperationContext) productRight).expression().getText();
            matched = true;
        } else if (productLeft instanceof MinicParser.UnaryOperationContext &&
                ((MinicParser.UnaryOperationContext) productLeft).op.getType() == MinicParser.MINUS) {
            B_text = ((MinicParser.UnaryOperationContext) productLeft).expression().getText();
            C_text = productRight.getText();
            matched = true;
        }

        if (matched) {
            rewriter.replace(ctx.op, "+");
            String replacementProduct;
            // Check for identity multiplication before creating the replacement string
            if ("1".equals(C_text)) {
                replacementProduct = B_text; // e.g., (b * 1) => b
            } else if ("1".equals(B_text)) {
                replacementProduct = C_text; // e.g., (1 * c) => c
            } else {
                replacementProduct = String.format("(%s * %s)", B_text, C_text);
            }
            rewriter.replace(ctx.right.start, ctx.right.stop, replacementProduct);
            return true;
        }

        return false;
    }


    /**
     * Simplifies expressions of the form `((a*c) op (b*c)) / c` to `a op b`.
     * This handles the complex case from the unit test by evaluating the final operation.
     */
    private void trySimplifyingDistributiveDivision(MinicParser.BinaryOperationContext ctx) {
        if (ctx.op.getType() != MinicParser.DIV) return;

        Integer C = getConstantValue(ctx.right);
        if (C == null || C == 0) return;

        MinicParser.ExpressionContext dividend = unwrapParentheses(ctx.left);
        if (!(dividend instanceof MinicParser.BinaryOperationContext)) return;
        MinicParser.BinaryOperationContext topBinOp = (MinicParser.BinaryOperationContext) dividend;

        MinicParser.ExpressionContext L = unwrapParentheses(topBinOp.left);
        MinicParser.ExpressionContext R = unwrapParentheses(topBinOp.right);

        if (!(L instanceof MinicParser.BinaryOperationContext) || !(R instanceof MinicParser.BinaryOperationContext)) return;
        MinicParser.BinaryOperationContext leftMult = (MinicParser.BinaryOperationContext) L;
        MinicParser.BinaryOperationContext rightMult = (MinicParser.BinaryOperationContext) R;

        if (leftMult.op.getType() != MinicParser.MUL || !C.equals(getConstantValue(leftMult.right))) return;
        String A_text = leftMult.left.getText();

        if (rightMult.op.getType() != MinicParser.MUL || !C.equals(getConstantValue(rightMult.right))) return;

        String op_text = topBinOp.op.getText();
        Integer B_val = getConstantValue(rightMult.left);
        String B_text = (B_val != null) ? B_val.toString() : rightMult.left.getText();

        String replacement;

        if (op_text.equals("-")) {
            if (B_val != null && B_val < 0) {
                replacement = String.format("%s + %d", A_text, Math.abs(B_val));
            } else {
                replacement = String.format("%s - %s", A_text, B_text);
            }
        } else if (op_text.equals("+")) {
            if (B_val != null && B_val < 0) {
                replacement = String.format("%s - %d", A_text, Math.abs(B_val));
            } else {
                replacement = String.format("%s + %s", A_text, B_text);
            }
        } else {
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