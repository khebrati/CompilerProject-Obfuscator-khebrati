package com.github.techniques.inliner;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Inlines a function.
 */
public class Inliner extends MinicBaseListener {

    public Map<String, List<MinicParser.StatementContext>> map = new HashMap();

    private TokenStreamRewriter rewriter;

    public Inliner(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
    }


    /**
     * Find a function definition, save its name and body, remove the definition.
     *
     * @param ctx the parse tree
     */
    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        //See if it's a function ( could be a declaration instead )
        if (ctx.decOrFunBody().paramListBlock() == null) return;
        //Save it's body
        var functionName = ctx.Identifier();
        if(functionName.getText().equals("main")) return;
        var functionBody = ctx.decOrFunBody().paramListBlock().block().statement();
        map.put(functionName.getText(), functionBody);
        rewriter.delete(ctx.getStart(), ctx.getStop());
    }

    /**
     * Updates all function calls in statements (not expressions)
     */
    @Override
    public void enterAssignmentOrFunCall(MinicParser.AssignmentOrFunCallContext ctx) {
        if (ctx.assignBodyOrArgsList().callArgsList() == null) return;
        String functionName = ctx.Identifier().getText();
        if (!map.containsKey(functionName)) return;
        StringBuilder replacement = new StringBuilder();
        map.get(functionName).forEach(statement ->
                replacement.append(statement.getText()).append(" "));
        rewriter.replace(ctx.getStart(), ctx.getStop(), replacement.toString().trim());
    }


    /**
     * Get the source code
     */
    public String getInlinedCode() {
        return rewriter.getText();
    }

    /**
     * Apply Var renaming to a parse tree
     */
    public static String inlineFunctions(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        var inliner = new Inliner(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(inliner, tree);
        return inliner.getInlinedCode();
    }
}
