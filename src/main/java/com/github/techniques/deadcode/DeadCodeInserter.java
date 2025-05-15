package com.github.techniques.deadcode;

import com.github.gen.MinicBaseListener;
import com.github.gen.MinicParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Random;

public class DeadCodeInserter extends MinicBaseListener {
    private static final Random random = new Random();
    private final TokenStreamRewriter rewriter;
    private final CommonTokenStream tokens;
    private int dummyCounter = 0;

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
        dummyCounter++;

        return switch (templateIndex) {
            case 0 -> // Simple assignment
                    String.format(DEAD_CODE_TEMPLATES[0],
                            dummyCounter, random.nextInt(100));
            case 1 -> // While loop
                    String.format(DEAD_CODE_TEMPLATES[1],
                            dummyCounter, random.nextInt(100), dummyCounter);
            case 2 -> // If-else statement
                    String.format(DEAD_CODE_TEMPLATES[2],
                            dummyCounter, random.nextInt(100),
                            dummyCounter, random.nextInt(100),
                            dummyCounter, random.nextInt(100));
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