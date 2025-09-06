package com.github.techniques.deObfuscate.rename;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Renames obfuscated variable and function names to simpler, standardized ones.
 * Variables are renamed to alphabetical characters (a, b, c, ...).
 * This class uses a stack of symbol tables to manage scopes correctly.
 */
public class NameSimplifier extends MinicBaseListener {

    private final TokenStreamRewriter rewriter;
    private final Deque<Map<String, String>> scopes = new ArrayDeque<>();
    private int varIndex = 0; // Used for alphabetical naming
    private int funcCounter = 1;

    /**
     * Convenience static method to rename variables in a pre-parsed Mini-C tree.
     * @param tree The program's parse tree, generated from a parser.
     * @param tokens The token stream used to generate the tree.
     * @return The code with renamed identifiers.
     */
    public static String rename(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        NameSimplifier renamer = new NameSimplifier(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(renamer, tree);
        return renamer.getRewrittenCode();
    }

    public NameSimplifier(TokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
        // Start with a global scope
        scopes.push(new HashMap<>());
    }

    /**
     * Generates a name from the alphabet based on an index.
     * 0 -> a, 1 -> b, ..., 25 -> z, 26 -> aa, 27 -> ab, etc.
     */
    private String generateAlphabeticalName(int index) {
        StringBuilder name = new StringBuilder();
        while (index >= 0) {
            name.insert(0, (char) ('a' + index % 26));
            index = index / 26 - 1;
        }
        return name.toString();
    }


    // --- Scope Management ---

    @Override
    public void enterBlock(MinicParser.BlockContext ctx) {
        // A function's main block uses the scope created by the function itself.
        // We only create a new scope for other, nested blocks (e.g., inside if/while).
        if (!(ctx.getParent() instanceof MinicParser.ParamListBlockContext)) {
            scopes.push(new HashMap<>());
        }
    }

    @Override
    public void exitBlock(MinicParser.BlockContext ctx) {
        // Corresponds to enterBlock; only pop for non-function blocks.
        if (!(ctx.getParent() instanceof MinicParser.ParamListBlockContext)) {
            scopes.pop();
        }
    }

    // --- Identifier Declaration & Renaming ---

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        // A function definition creates a new scope for its parameters and body.
        if (ctx.decOrFunBody() != null && ctx.decOrFunBody().paramListBlock() != null) {
            scopes.push(new HashMap<>());
        }
    }

    @Override
    public void exitDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        TerminalNode id = ctx.Identifier();
        String oldName = id.getText();

        // Handle function definitions
        if (ctx.decOrFunBody() != null && ctx.decOrFunBody().paramListBlock() != null) {
            // Pop the function's own scope. This is done for all functions.
            scopes.pop();

            // Special case: do not rename the 'main' function
            if ("main".equals(oldName)) {
                return; // Do not rename or add to scope map.
            }

            // For all other functions, rename and add to the parent scope
            String newName = "func" + funcCounter++;
            scopes.peek().put(oldName, newName);
            rewriter.replace(id.getSymbol(), newName);

        } else { // Handle variable declarations
            String newName = generateAlphabeticalName(varIndex++);
            scopes.peek().put(oldName, newName); // Add to the current scope.
            rewriter.replace(id.getSymbol(), newName);
        }
    }

    @Override
    public void exitParam(MinicParser.ParamContext ctx) {
        TerminalNode id = ctx.Identifier();
        String oldName = id.getText();
        String newName = generateAlphabeticalName(varIndex++);
        // Parameters are added to the current scope, which is the function's scope.
        scopes.peek().put(oldName, newName);
        rewriter.replace(id.getSymbol(), newName);
    }


    // --- Identifier Usage ---

    @Override
    public void exitAssignmentOrFunCall(MinicParser.AssignmentOrFunCallContext ctx) {
        renameIdentifierUsage(ctx.Identifier());
    }

    @Override
    public void exitVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx) {
        renameIdentifierUsage(ctx.Identifier());
    }

    /**
     * Finds the new name for a given identifier by searching scopes from innermost
     * to outermost, then rewrites the token.
     */
    private void renameIdentifierUsage(TerminalNode idNode) {
        String oldName = idNode.getText();
        for (Map<String, String> scope : scopes) {
            if (scope.containsKey(oldName)) {
                rewriter.replace(idNode.getSymbol(), scope.get(oldName));
                return;
            }
        }
    }

    public String getRewrittenCode() {
        return rewriter.getText();
    }
}

