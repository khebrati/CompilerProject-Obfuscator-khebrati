package com.github.techniques.deObfuscate.deadcode;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashSet;
import java.util.Set;

public class DeadCodeRemover extends MinicBaseListener {
    private final CommonTokenStream tokens;
    private String simplifiedCode;
    private final Set<String> declaredVariables;
    private final Set<String> usedVariables;
    private boolean afterReturn;
    private boolean inCurrentBlock;

    public DeadCodeRemover(CommonTokenStream tokens) {
        this.tokens = tokens;
        this.simplifiedCode = tokens.getText(new Interval(0, tokens.size() - 1));
        this.declaredVariables = new HashSet<>();
        this.usedVariables = new HashSet<>();
        this.afterReturn = false;
        this.inCurrentBlock = false;
    }

    public static String removeDeadCode(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        DeadCodeRemover remover = new DeadCodeRemover(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(remover, tree);
        return remover.getSimplifiedCode();
    }

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        // Record variable declarations
        if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            declaredVariables.add(varName);
        }
    }

    @Override
    public void enterVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx) {
        // Record variable usage
        if (ctx.Identifier() != null) {
            String varName = ctx.Identifier().getText();
            usedVariables.add(varName);
        }
    }

    @Override
    public void enterReturnStatement(MinicParser.ReturnStatementContext ctx) {
        afterReturn = true;
        inCurrentBlock = true;
    }

    @Override
    public void enterBlock(MinicParser.BlockContext ctx) {
        if (afterReturn && inCurrentBlock) {
            // Mark all statements after return in this block for removal
            handleBlockAfterReturn(ctx);
        }
    }

    private void handleBlockAfterReturn(MinicParser.BlockContext ctx) {
        boolean foundReturn = false;
        for (MinicParser.StatementContext stmt : ctx.statement()) {
            if (stmt instanceof MinicParser.ReturnStatementContext) {
                foundReturn = true;
                continue;
            }
            if (foundReturn) {
                safeRemoveFromSource(stmt);
            }
        }
    }

    @Override
    public void exitBlock(MinicParser.BlockContext ctx) {
        inCurrentBlock = false;

        // Check for empty blocks
        String blockContent = tokens.getText(ctx);
        if (blockContent.trim().matches("\\{\\s*\\}")) {
            safeRemoveFromSource(ctx);
        }
    }

    @Override
    public void exitProgram(MinicParser.ProgramContext ctx) {
        // Remove unused variables
        Set<String> unusedVars = new HashSet<>(declaredVariables);
        unusedVars.removeAll(usedVariables);

        for (String unusedVar : unusedVars) {
            removeVariableDeclaration(unusedVar);
        }
    }

    private void removeVariableDeclaration(String varName) {
        String[] lines = simplifiedCode.split("\n");
        StringBuilder result = new StringBuilder();
        boolean skipNext = false;

        for (String line : lines) {
            if (skipNext) {
                skipNext = false;
                continue;
            }

            // Skip declarations of unused variables
            if (!line.trim().matches(".*\\b" + varName + "\\s*([;=]|\\s*=\\s*[^,;]+[;,]).*")) {
                result.append(line).append("\n");
            }
        }

        simplifiedCode = result.toString().trim();
    }

    private void safeRemoveFromSource(ParserRuleContext ctx) {
        try {
            if (ctx != null && ctx.start != null && ctx.stop != null) {
                int startIndex = ctx.start.getStartIndex();
                int stopIndex = ctx.stop.getStopIndex();

                if (startIndex >= 0 && stopIndex >= 0 &&
                        startIndex < simplifiedCode.length() &&
                        stopIndex < simplifiedCode.length() &&
                        startIndex <= stopIndex) {

                    String beforeContext = simplifiedCode.substring(0, startIndex);
                    String afterContext = simplifiedCode.substring(stopIndex + 1);

                    // Clean up trailing semicolons and whitespace
                    beforeContext = beforeContext.replaceAll("\\s*;\\s*$", "");

                    // Add newline if needed
                    if (!beforeContext.endsWith("\n") && !afterContext.startsWith("\n")) {
                        afterContext = "\n" + afterContext;
                    }

                    simplifiedCode = beforeContext + afterContext;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Log error but continue processing
            System.err.println("Error removing code segment: " + e.getMessage());
        }
    }

    public String getSimplifiedCode() {
        return simplifiedCode;
    }
}