import gen.ObfusBaseListener;
import gen.ObfusParser;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Variable name Obfusator that renames each variable to a random name.
 */
public class VariableObfuscator extends ObfusBaseListener {

    private final Map<String, String> variableMap = new HashMap<>();
    private final Random random = new Random();
    private TokenStreamRewriter rewriter;

    public VariableObfuscator(CommonTokenStream tokens) {
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


    @Override public void enterDeclarationOrFun(ObfusParser.DeclarationOrFunContext ctx) {
        if (ctx.getToken(ObfusParser.Identifier,0) != null) {
            String originalName = ctx.getToken(ObfusParser.Identifier,0).getText();
            String newName = generateRandomName();
            variableMap.put(originalName, newName);

            // Replace the original identifier with the Obfusated one
            rewriter.replace(ctx.getToken(ObfusParser.Identifier,0).getSymbol(), newName);
        }
    }


    /**
     * Updates variable references in expressions
     */
    @Override
    public void enterVariableReference(ObfusParser.VariableReferenceContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    /**
     * Updates variable references in assignments
     */
    @Override
    public void enterAssignment(ObfusParser.AssignmentContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    /**
     * Get the Obfusated source code
     */
    public String getObfusatedCode() {
        return rewriter.getText();
    }

    /**
     * Apply Obfusation to a parse tree
     */
    public static String Obfuscate(ObfusParser.ProgramContext programContext, CommonTokenStream tokens) {
        VariableObfuscator Obfuscator = new VariableObfuscator(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(Obfuscator, programContext);
        return Obfuscator.getObfusatedCode();
    }
}