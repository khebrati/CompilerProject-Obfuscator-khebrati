package com.github.techniques.deadcode;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class DeadCodeInserter extends MinicBaseListener {
    private static final Random random = new Random();
    private final TokenStreamRewriter rewriter;
    private final CommonTokenStream tokens;
    private int dummyCounter = 0;
    private final Set<Integer> usedDummies = new HashSet<>();

    private static final String[] DEAD_CODE_TEMPLATES = {
            "\n    int _dummy%d = %d;\n",
            "\n    while(_dummy%d < %d) { _dummy%d++; }\n",
            "\n    if(_dummy%d > %d) { _dummy%d = %d; } else { _dummy%d = %d; }\n"
    };

    public DeadCodeInserter(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
    }

    @Override
    public void enterProgram(MinicParser.ProgramContext ctx) {
        // Insert declarations for all dummy variables at the start of the file
        StringBuilder declarations = new StringBuilder();
        for (int i = 1; i <= 10; i++) { // Pre-declare 10 dummy variables
            declarations.append(String.format("int _dummy%d = 0;\n", i));
        }
        rewriter.insertBefore(ctx.getStart(), declarations.toString());
    }

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        // Increased probability to 0.7 (70%)
        if (random.nextDouble() < 0.7) {
            // Find opening brace and insert after it
            for (int i = ctx.getStart().getTokenIndex(); i < tokens.size(); i++) {
                Token token = tokens.get(i);
                if (token.getText().equals("{")) {
                    // Insert 1-3 dead code statements
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
        int templateIndex = random.nextInt(DEAD_CODE_TEMPLATES.length);

        // Use a dummy variable from 1-10 instead of incrementing
        int dummyNum = random.nextInt(10) + 1;
        usedDummies.add(dummyNum);

        return switch (templateIndex) {
            case 0 -> // Simple assignment
                    String.format(DEAD_CODE_TEMPLATES[0],
                            dummyNum, random.nextInt(100));
            case 1 -> // While loop
                    String.format(DEAD_CODE_TEMPLATES[1],
                            dummyNum, random.nextInt(100), dummyNum);
            case 2 -> // If-else statement
                    String.format(DEAD_CODE_TEMPLATES[2],
                            dummyNum, random.nextInt(100),
                            dummyNum, random.nextInt(100),
                            dummyNum, random.nextInt(100));
            default -> "";
        };
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