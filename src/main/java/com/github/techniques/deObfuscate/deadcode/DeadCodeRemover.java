package com.github.techniques.deObfuscate.deadcode;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class DeadCodeRemover extends MinicBaseListener {

    private final CommonTokenStream tokens;

    // declarations and reads
    private final Set<String> declaredVariables = new HashSet<>();
    private final Set<String> usedVariables = new HashSet<>();

    // contexts to remove
    private final Set<ParserRuleContext> statementsToRemove = new HashSet<>();
    private final Deque<MinicParser.BlockContext> blockStack = new ArrayDeque<>();

    // maps/collections to find contexts later
    private final Map<String, ParserRuleContext> variableDeclarations = new HashMap<>();
    private final Set<ParserRuleContext> functionDefinitions = new HashSet<>();
    private final Set<ParserRuleContext> emptyBlocks = new HashSet<>();

    // record assignment statements: varName -> list of statement contexts (assignment statements)
    private final Map<String, List<ParserRuleContext>> assignmentStatements = new HashMap<>();

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
        // reset state (safe if re-used)
        declaredVariables.clear();
        usedVariables.clear();
        statementsToRemove.clear();
        blockStack.clear();
        variableDeclarations.clear();
        emptyBlocks.clear();
        functionDefinitions.clear();
        assignmentStatements.clear();
    }

    @Override
    public void enterBlock(MinicParser.BlockContext ctx) {
        blockStack.push(ctx);
    }

    @Override
    public void exitBlock(MinicParser.BlockContext ctx) {
        blockStack.pop();
        if (ctx.statement().isEmpty()) {
            emptyBlocks.add(ctx);
        }
    }

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        if (ctx.Identifier() == null) return;
        String varName = ctx.Identifier().getText();
        declaredVariables.add(varName);
        variableDeclarations.put(varName, ctx);

        // if decOrFunBody -> paramListBlock != null => function definition
        if (ctx.decOrFunBody() != null && ctx.decOrFunBody().paramListBlock() != null) {
            functionDefinitions.add(ctx);
        }
        // If a declaration has initializer, mark reads inside its RHS expression so we capture dependencies
        if (ctx.decOrFunBody() != null && ctx.decOrFunBody().declarationBody() != null) {
            MinicParser.DeclarationBodyContext db = ctx.decOrFunBody().declarationBody();
            // declarationBody: (assignmentOp expression)? SEMI
            // find any expression child and walk it
            for (ParseTree ch : db.children) {
                if (ch instanceof MinicParser.ExpressionContext) {
                    markVariablesInExpression((MinicParser.ExpressionContext) ch);
                }
            }
        }
    }

    @Override
    public void enterVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx) {
        if (ctx.Identifier() != null) {
            // identifier itself is read (either variable or function name)
            usedVariables.add(ctx.Identifier().getText());
        }
        // also scan children for argument expressions and mark reads inside them
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree ch = ctx.getChild(i);
            if (ch instanceof MinicParser.ExpressionContext) {
                markVariablesInExpression((MinicParser.ExpressionContext) ch);
            }
        }
    }

    @Override
    public void enterAssignmentOrFunCall(MinicParser.AssignmentOrFunCallContext ctx) {
        // This context corresponds to: Identifier assignBodyOrArgsList
        if (ctx.Identifier() == null) return;

        // Determine whether it's an assignment (assignBody present) or a call (args)
        MinicParser.AssignBodyOrArgsListContext abo = ctx.assignBodyOrArgsList();
        if (abo == null) return;

        // assignment case: assignBody -> assignmentOp expression SEMI
        if (abo.assignBody() != null) {
            MinicParser.AssignBodyContext ab = abo.assignBody();
            // mark reads in RHS expression (this counts as variable uses)
            for (ParseTree ch : ab.children) {
                if (ch instanceof MinicParser.ExpressionContext) {
                    markVariablesInExpression((MinicParser.ExpressionContext) ch);
                }
            }
            // record assignment statement context for potential removal later (do NOT mark LHS as used)
            String lhs = ctx.Identifier().getText();
            assignmentStatements.computeIfAbsent(lhs, k -> new ArrayList<>()).add(ctx);
        } else {
            // function-call-with-args: mark reads in its argument expressions
            for (ParseTree ch : abo.children) {
                if (ch instanceof MinicParser.ExpressionContext) {
                    markVariablesInExpression((MinicParser.ExpressionContext) ch);
                }
            }
        }
    }

    @Override
    public void enterPrintStatement(MinicParser.PrintStatementContext ctx) {
        if (ctx.parExpression() != null && ctx.parExpression().expression() != null) {
            markVariablesInExpression(ctx.parExpression().expression());
        }
    }

    @Override
    public void enterPrintlnStatement(MinicParser.PrintlnStatementContext ctx) {
        if (ctx.parExpression() != null && ctx.parExpression().expression() != null) {
            markVariablesInExpression(ctx.parExpression().expression());
        }
    }

    @Override
    public void enterIfStatement(MinicParser.IfStatementContext ctx) {
        if (ctx.parExpression() != null && ctx.parExpression().expression() != null) {
            markVariablesInExpression(ctx.parExpression().expression());
        }
    }

    @Override
    public void enterWhileStatement(MinicParser.WhileStatementContext ctx) {
        if (ctx.parExpression() != null && ctx.parExpression().expression() != null) {
            markVariablesInExpression(ctx.parExpression().expression());
        }
    }

    @Override
    public void enterReturnStatement(MinicParser.ReturnStatementContext ctx) {
        if (ctx.expression() != null) {
            markVariablesInExpression(ctx.expression());
        }

        // Mark all subsequent statements IN THE SAME BLOCK as dead (textually after this return)
        if (!blockStack.isEmpty()) {
            MinicParser.BlockContext blk = blockStack.peek();
            int retEnd = ctx.getStop().getStopIndex();
            for (MinicParser.StatementContext st : blk.statement()) {
                if (st.getStart().getStartIndex() > retEnd) {
                    statementsToRemove.add(st);
                }
            }
        }
    }

    // recursively mark variables used in an expression
    private void markVariablesInExpression(MinicParser.ExpressionContext expr) {
        if (expr == null) return;

        // Variable or function call (Identifier argsListOrNothing)
        if (expr instanceof MinicParser.VariableOrFunctionCallContext) {
            MinicParser.VariableOrFunctionCallContext v = (MinicParser.VariableOrFunctionCallContext) expr;
            if (v.Identifier() != null) usedVariables.add(v.Identifier().getText());
            // mark reads in possible arg expressions
            for (int i = 0; i < v.getChildCount(); i++) {
                ParseTree ch = v.getChild(i);
                if (ch instanceof MinicParser.ExpressionContext) {
                    markVariablesInExpression((MinicParser.ExpressionContext) ch);
                }
            }
            return;
        }

        // Binary operation
        if (expr instanceof MinicParser.BinaryOperationContext) {
            MinicParser.BinaryOperationContext b = (MinicParser.BinaryOperationContext) expr;
            markVariablesInExpression(b.left);
            markVariablesInExpression(b.right);
            return;
        }

        // Unary operation
        if (expr instanceof MinicParser.UnaryOperationContext) {
            MinicParser.UnaryOperationContext u = (MinicParser.UnaryOperationContext) expr;
            markVariablesInExpression(u.expression());
            return;
        }

        // Parentheses expression
        if (expr instanceof MinicParser.ParenthesesExpressionContext) {
            MinicParser.ParenthesesExpressionContext p = (MinicParser.ParenthesesExpressionContext) expr;
            if (p.parExpression() != null && p.parExpression().expression() != null) {
                markVariablesInExpression(p.parExpression().expression());
            }
            return;
        }

        // other expression types (literals, reads like readInt/readDouble/readLine, toString) do not mark identifiers
    }

    private String getProcessedCode() {
        // 1) Remove unused declarations (as before)
        Set<String> unusedVars = new HashSet<>(declaredVariables);
        unusedVars.removeAll(usedVariables);

        // Don't remove function definitions (even if never referenced)
        for (ParserRuleContext funcDef : functionDefinitions) {
            if (funcDef instanceof MinicParser.DecOrFunDefinitionContext) {
                MinicParser.DecOrFunDefinitionContext d = (MinicParser.DecOrFunDefinitionContext) funcDef;
                if (d.Identifier() != null) unusedVars.remove(d.Identifier().getText());
            }
        }

        // mark declaration contexts for removal
        for (String v : unusedVars) {
            ParserRuleContext decl = variableDeclarations.get(v);
            if (decl != null) statementsToRemove.add(decl);
        }

        // 2) Remove assignment statements for variables that are never read anywhere
        for (Map.Entry<String, List<ParserRuleContext>> e : assignmentStatements.entrySet()) {
            String var = e.getKey();
            if (!usedVariables.contains(var)) {
                for (ParserRuleContext asgCtx : e.getValue()) {
                    statementsToRemove.add(asgCtx);
                }
            }
        }

        // 3) Add empty blocks
        statementsToRemove.addAll(emptyBlocks);

        // 4) Sort and delete from token stream text
        List<ParserRuleContext> sorted = new ArrayList<>(statementsToRemove);
        sorted.sort((a, b) -> Integer.compare(b.getStart().getStartIndex(), a.getStart().getStartIndex()));

        StringBuilder result = new StringBuilder(tokens.getText());
        for (ParserRuleContext ctx : sorted) {
            int start = Math.max(0, ctx.getStart().getStartIndex());
            int end = Math.min(result.length(), ctx.getStop().getStopIndex() + 1);
            if (start < end) {
                result.delete(start, end);
            }
        }

        // 5) Final cleanup and pretty printing (multi-line)
        return cleanUpCode(result.toString());
    }

    private String cleanUpCode(String code) {
        // normalize spaces
        code = code.replaceAll("[ \\t\\f\\r]+", " ");

        // place semicolons and braces on their own/adjacent lines for readability
        code = code.replaceAll("\\s*;\\s*", ";\n");
        code = code.replaceAll("\\s*\\{\\s*", " {\n");
        code = code.replaceAll("\\s*}\\s*", "\n}\n");

        // remove consecutive empty lines and trim each line
        String[] lines = code.split("\n");
        StringBuilder out = new StringBuilder();
        for (String line : lines) {
            String t = line.trim();
            if (!t.isEmpty()) {
                out.append(t).append("\n");
            }
        }
        return out.toString().trim();
    }
}