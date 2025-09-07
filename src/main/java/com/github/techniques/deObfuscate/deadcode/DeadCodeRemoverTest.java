package com.github.techniques.deObfuscate.deadcode;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class DeadCodeRemover extends MinicBaseListener {

    private final CommonTokenStream tokens;
    private final Set<String> declaredVariables = new HashSet<>();
    private final Set<String> usedVariables = new HashSet<>();
    private final Set<ParserRuleContext> statementsToRemove = new HashSet<>();
    private final Deque<MinicParser.BlockContext> blockStack = new ArrayDeque<>();
    private final Map<String, ParserRuleContext> variableDeclarations = new HashMap<>();
    private final Set<ParserRuleContext> emptyBlocks = new HashSet<>();
    private final Set<ParserRuleContext> functionDefinitions = new HashSet<>();
    private final Set<String> globalVariables = new HashSet<>();

    public DeadCodeRemover(CommonTokenStream tokens) {
        this.tokens = tokens;
    }

    public static String removeDeadCode(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        DeadCodeRemover remover = new DeadCodeRemover(tokens);
        ParseTreeWalker.DEFAULT.walk(remover, tree);
        return remover.getProcessedCode();
    }

    @Override
    public void enterProgram(MinicParser.ProgramContext ctx) {
        // Reset state for new program analysis
        declaredVariables.clear();
        usedVariables.clear();
        statementsToRemove.clear();
        blockStack.clear();
        variableDeclarations.clear();
        emptyBlocks.clear();
        functionDefinitions.clear();
        globalVariables.clear();
    }

    @Override
    public void enterBlock(MinicParser.BlockContext ctx) {
        blockStack.push(ctx);
    }

    @Override
    public void exitBlock(MinicParser.BlockContext ctx) {
        blockStack.pop();

        // Check if block is empty
        if (ctx.statement().isEmpty()) {
            emptyBlocks.add(ctx);
        }
    }

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            declaredVariables.add(varName);
            variableDeclarations.put(varName, ctx);

            // Check if this is a function definition
            if (ctx.decOrFunBody().paramListBlock() != null) {
                functionDefinitions.add(ctx);
            } else {
                // This is a global variable declaration
                globalVariables.add(varName);
            }
        }
    }

    @Override
    public void enterVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx) {
        if (ctx.Identifier() != null && !isInDeadCode(ctx)) {
            usedVariables.add(ctx.Identifier().getText());
        }
    }

    @Override
    public void enterAssignmentOrFunCall(MinicParser.AssignmentOrFunCallContext ctx) {
        if (ctx.Identifier() != null && !isInDeadCode(ctx)) {
            // This is a variable assignment, so mark it as used
            usedVariables.add(ctx.Identifier().getText());
        }
    }

    @Override
    public void enterPrintStatement(MinicParser.PrintStatementContext ctx) {
        if (!isInDeadCode(ctx)) {
            markVariablesInExpression(ctx.parExpression().expression());
        }
    }

    @Override
    public void enterPrintlnStatement(MinicParser.PrintlnStatementContext ctx) {
        if (!isInDeadCode(ctx)) {
            markVariablesInExpression(ctx.parExpression().expression());
        }
    }

    @Override
    public void enterReturnStatement(MinicParser.ReturnStatementContext ctx) {
        if (ctx.expression() != null && !isInDeadCode(ctx)) {
            markVariablesInExpression(ctx.expression());
        }

        // Mark code after return as dead
        if (!blockStack.isEmpty()) {
            MinicParser.BlockContext block = blockStack.peek();
            boolean afterReturn = false;

            for (MinicParser.StatementContext st : block.statement()) {
                if (st == ctx) {
                    afterReturn = true;
                    continue;
                }
                if (afterReturn) {
                    statementsToRemove.add(st);
                }
            }
        }
    }

    private void markVariablesInExpression(MinicParser.ExpressionContext expr) {
        if (expr instanceof MinicParser.VariableOrFunctionCallContext) {
            MinicParser.VariableOrFunctionCallContext varCall =
                    (MinicParser.VariableOrFunctionCallContext) expr;
            if (varCall.Identifier() != null) {
                usedVariables.add(varCall.Identifier().getText());
            }
        } else if (expr instanceof MinicParser.BinaryOperationContext) {
            MinicParser.BinaryOperationContext binOp =
                    (MinicParser.BinaryOperationContext) expr;
            markVariablesInExpression(binOp.left);
            markVariablesInExpression(binOp.right);
        } else if (expr instanceof MinicParser.UnaryOperationContext) {
            MinicParser.UnaryOperationContext unaryOp =
                    (MinicParser.UnaryOperationContext) expr;
            markVariablesInExpression(unaryOp.expression());
        } else if (expr instanceof MinicParser.ParenthesesExpressionContext) {
            MinicParser.ParenthesesExpressionContext parenExpr =
                    (MinicParser.ParenthesesExpressionContext) expr;
            markVariablesInExpression(parenExpr.parExpression().expression());
        }
    }

    private boolean isInDeadCode(ParserRuleContext ctx) {
        ParserRuleContext parent = ctx;
        while (parent != null) {
            if (statementsToRemove.contains(parent)) {
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    private String getProcessedCode() {
        // First, mark unused variable declarations for removal (excluding function definitions)
        Set<String> unusedVars = new HashSet<>(declaredVariables);
        unusedVars.removeAll(usedVariables);

        // Don't remove function definitions
        for (ParserRuleContext funcDef : functionDefinitions) {
            if (funcDef instanceof MinicParser.DecOrFunDefinitionContext) {
                MinicParser.DecOrFunDefinitionContext decOrFun = (MinicParser.DecOrFunDefinitionContext) funcDef;
                unusedVars.remove(decOrFun.Identifier().getText());
            }
        }

        for (String unusedVar : unusedVars) {
            ParserRuleContext decl = variableDeclarations.get(unusedVar);
            if (decl != null) {
                statementsToRemove.add(decl);
            }
        }

        // Add empty blocks to statements to remove
        statementsToRemove.addAll(emptyBlocks);

        // Create a sorted list of contexts to remove (from end to beginning)
        List<ParserRuleContext> sortedContexts = new ArrayList<>(statementsToRemove);
        sortedContexts.sort((a, b) -> b.getStart().getStartIndex() - a.getStart().getStartIndex());

        // Build the result by removing the marked contexts
        StringBuilder result = new StringBuilder(tokens.getText());

        for (ParserRuleContext ctx : sortedContexts) {
            int start = ctx.getStart().getStartIndex();
            int end = ctx.getStop().getStopIndex() + 1;

            // Make sure we don't go out of bounds
            if (start >= 0 && end <= result.length()) {
                result.delete(start, end);
            }
        }

        // Clean up the result with proper spacing
        return cleanUpCode(result.toString());
    }

    private String cleanUpCode(String code) {
        // Remove multiple consecutive spaces
        code = code.replaceAll(" +", " ");

        // Clean up around specific tokens while preserving newlines
        code = code.replaceAll("\\s*;\\s*", ";\n");
        code = code.replaceAll("\\s*\\{\\s*", " {\n");
        code = code.replaceAll("\\s*}\\s*", "\n}\n");

        // Remove empty lines and trim each line
        String[] lines = code.split("\n");
        StringBuilder result = new StringBuilder();

        for (String line : lines) {
            String trimmed = line.trim();
            if (!trimmed.isEmpty()) {
                result.append(trimmed).append("\n");
            }
        }

        return result.toString().trim();
    }
}