package com.github.techniques.deadcode;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeadCodeInserter extends MinicBaseListener {
    private static final Random random = new Random();
    private final TokenStreamRewriter rewriter;
    public static final int NUM_GLOBAL_DUMMIES = 10;
    public static final String GLOBAL_DUMMY_PREFIX = "_dummy";
    private final List<String> globalDummyNames = new ArrayList<>();

    public DeadCodeInserter(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
        for (int i = 1; i <= NUM_GLOBAL_DUMMIES; i++) {
            globalDummyNames.add(GLOBAL_DUMMY_PREFIX + i);
        }
    }

    @Override
    public void enterProgram(MinicParser.ProgramContext ctx) {
        StringBuilder declarations = new StringBuilder();
        for (String dummyName : globalDummyNames) {
            declarations.append(String.format("int %s = 0;\n", dummyName));
        }
        rewriter.insertBefore(ctx.getStart(), declarations.toString());
    }

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        if (random.nextDouble() < 0.7) {
            for (int i = ctx.getStart().getTokenIndex(); i < rewriter.getTokenStream().size(); i++) {
                Token token = rewriter.getTokenStream().get(i);
                if (token.getText().equals("{")) {
                    int numInsertions = random.nextInt(3) + 1;
                    for (int j = 0; j < numInsertions; j++) {
                        String deadCode = generateDeadCode();
                        rewriter.insertAfter(token, deadCode);
                    }
                    break;
                }
            }
        }
    }

    private String generateDeadCode() {
        // Only use declared dummy names!
        String dummyName = globalDummyNames.get(random.nextInt(globalDummyNames.size()));
        int pick = random.nextInt(3);
        int a = random.nextInt(100), b = random.nextInt(100), c = random.nextInt(100);
        switch (pick) {
            case 0: return String.format("\n    %s = %d;\n", dummyName, a);
            case 1: return String.format("\n    while(%s < %d) { %s = %s + 1; }\n", dummyName, a, dummyName, dummyName);
            case 2: return String.format("\n    if(%s > %d) { %s = %d; } else { %s = %d; }\n", dummyName, a, dummyName, b, dummyName, c);
            default: return "";
        }
    }

    public String getObfuscatedCode() {
        return rewriter.getText();
    }

    public static String insertDeadCode(MinicParser.ProgramContext tree, CommonTokenStream tokens) {
        DeadCodeInserter inserter = new DeadCodeInserter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(inserter, tree);
        return inserter.getObfuscatedCode();
    }
}