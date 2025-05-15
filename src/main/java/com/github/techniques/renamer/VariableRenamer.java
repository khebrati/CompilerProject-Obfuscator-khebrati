package com.github.techniques.renamer;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Variable name Minicator that renames each variable to a random name.
 */
public class VariableRenamer extends MinicBaseListener {

    private final Map<String, String> variableMap = new HashMap<>();
    private final Random random = new Random();
    private TokenStreamRewriter rewriter;

    public VariableRenamer(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
    }

    /**
     * Generate a random variable name
     */
    private String generateRandomName() {
        // Use _v prefix to avoid keyword conflicts
        StringBuilder sb = new StringBuilder("_v");
        for (int i = 0; i < 8; i++) {
            sb.append((char) ('a' + random.nextInt(26)));
        }
        return sb.toString();
    }


    @Override public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        if (ctx.Identifier()!= null) {
            String originalName = ctx.getToken(MinicParser.Identifier,0).getText();
            if(originalName.equals("main")) return;
            String newName = generateRandomName();
            variableMap.put(originalName, newName);

            rewriter.replace(ctx.getToken(MinicParser.Identifier,0).getSymbol(), newName);
        }
    }


    /**
     * Updates variable references in expressions
     */
    @Override
    public void enterVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    /**
     * Updates variable references in assignments
     */
    @Override
    public void enterAssignmentOrFunCall(MinicParser.AssignmentOrFunCallContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    /**
     * Get the source code
     */
    public String getRenamedCode() {
        return rewriter.getText();
    }

    /**
     * Apply Var renaming to a parse tree
     */
    public static String renameVar(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        VariableRenamer renamer = new VariableRenamer(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(renamer, tree);
        return renamer.getRenamedCode();
    }
}