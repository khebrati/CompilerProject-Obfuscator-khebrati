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

    public DeadCodeRemover(CommonTokenStream tokens) {
        this.tokens = tokens;
    }

    public static String removeDeadCode(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        DeadCodeRemover remover = new DeadCodeRemover(tokens);
        ParseTreeWalker.DEFAULT.walk(remover, tree);
        return remover.getProcessedCode();
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
        if (ctx.Identifier() != null && !isInDeadCode(ctx)) {
            String varName = ctx.Identifier().getText();
            declaredVariables.add(varName);
            variableDeclarations.put(varName, ctx);
        }
    }

    @Override
    public void enterVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx) {
        if (ctx.Identifier() != null && !isInDeadCode(ctx)) {
            usedVariables.add(ctx.Identifier().getText());
        }
    }

    @Override
    public void exitReturnStatement(MinicParser.ReturnStatementContext ctx) {
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
        // First, mark unused variable declarations for removal
        Set<String> unusedVars = new HashSet<>(declaredVariables);
        unusedVars.removeAll(usedVariables);
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
        // Remove multiple spaces but preserve single spaces
        code = code.replaceAll("\\s+", " ");

        // Add spaces around parentheses for control statements
        code = code.replaceAll("(if|while|for)\\(", "$1 (");
        code = code.replaceAll("(if|while|for) \\(", "$1 (");

        // Ensure space after closing parenthesis before opening brace
        code = code.replaceAll("\\)\\{", ") {");

        // Clean up around semicolons
        code = code.replaceAll("\\s*;\\s*", "; ");

        // Remove trailing spaces
        code = code.trim();

        // Remove spaces before commas
        code = code.replaceAll("\\s*,", ",");

        // Remove empty statements
        code = code.replaceAll(";\\s*;", ";");

        // Ensure proper spacing around braces
        code = code.replaceAll("\\s*\\{\\s*", " { ");
        code = code.replaceAll("\\s*}\\s*", " } ");

        // Final cleanup of multiple spaces
        code = code.replaceAll("\\s+", " ");

        return code.trim();
    }
}