package com.github.techniques.obfuscate.renamer;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Renamer extends MinicBaseListener {

    private final Map<String, String> variableMap = new HashMap<>();
    private final Random random = new Random();
    private TokenStreamRewriter rewriter;

    public Renamer(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
    }

    private String generateRandomName() {
        StringBuilder sb = new StringBuilder("_v");
        for (int i = 0; i < 8; i++) {
            sb.append((char) ('a' + random.nextInt(26)));
        }
        return sb.toString();
    }

    @Override
    public void enterProgram(MinicParser.ProgramContext ctx) {
        // Pre-register all dummy names for renaming
        for (int i = 1; i <= 10; i++) {
            String dummy = "_dummy" + i;
            if (!variableMap.containsKey(dummy)) {
                variableMap.put(dummy, generateRandomName());
            }
        }
    }

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        if (ctx.Identifier() != null) {
            String originalName = ctx.Identifier().getText();
            if (!originalName.equals("main")) { // Do not rename main!
                if (!variableMap.containsKey(originalName)) {
                    String newName = generateRandomName();
                    variableMap.put(originalName, newName);
                }
                rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
            }
        }
    }

    @Override
    public void enterVariableOrFunctionCall(MinicParser.VariableOrFunctionCallContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (!originalName.equals("main") && variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    @Override
    public void enterAssignmentOrFunCall(MinicParser.AssignmentOrFunCallContext ctx) {
        String originalName = ctx.Identifier().getText();
        if (!originalName.equals("main") && variableMap.containsKey(originalName)) {
            rewriter.replace(ctx.Identifier().getSymbol(), variableMap.get(originalName));
        }
    }

    public String getRenamedCode() {
        return rewriter.getText();
    }

    public static String renameVar(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        Renamer renamer = new Renamer(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(renamer, tree);
        return renamer.getRenamedCode();
    }
}