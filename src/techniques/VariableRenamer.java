package techniques;

import gen.MinicBaseListener;
import gen.MinicParser;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.CommonTokenStream;
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


    @Override public void enterDeclarationOrFun(MinicParser.DeclarationOrFunContext ctx) {
        if (ctx.getToken(MinicParser.Identifier,0) != null) {
            String originalName = ctx.getToken(MinicParser.Identifier,0).getText();
            String newName = generateRandomName();
            variableMap.put(originalName, newName);

            rewriter.replace(ctx.getToken(MinicParser.Identifier,0).getSymbol(), newName);
        }
    }


    /**
     * Updates variable references in expressions
     */
    @Override
    public void enterVariableReference(MinicParser.VariableReferenceContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    /**
     * Updates variable references in assignments
     */
    @Override
    public void enterAssignment(MinicParser.AssignmentContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    /**
     * Get the Minicated source code
     */
    public String getRenamedCode() {
        return rewriter.getText();
    }

    /**
     * Apply Minication to a parse tree
     */
    public static String renameVar(MinicParser.ProgramContext programContext, CommonTokenStream tokens) {
        VariableRenamer renamer = new VariableRenamer(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(renamer, programContext);
        return renamer.getRenamedCode();
    }
}