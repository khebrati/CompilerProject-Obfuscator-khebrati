package techniques.inliner;

import gen.MinicBaseListener;
import gen.MinicLexer;
import gen.MinicParser;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.CommonTokenStream;
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


    @Override
    public void enterDeclarationOrFun(MinicParser.DeclarationOrFunContext ctx) {
        //See if it's a function ( could be a declaration instead )
        if (ctx.decOrFun().function() != null) {
            //Save it's body
            var functionName = ctx.Identifier();
            var functionBody = ctx.decOrFun().function().block().statement();
            map.put(functionName.getSymbol().getText(),functionBody);
        }

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
