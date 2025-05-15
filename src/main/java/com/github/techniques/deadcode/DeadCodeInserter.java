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

    private static final String[] DEAD_CODE_TEMPLATES = {
            "\n    int _dummy%d;\n    _dummy%d = %d;\n",
            "\n    while(_dummy%d < %d) { _dummy%d = _dummy%d + 1; }\n",
            "\n    if(_dummy%d > %d) { _dummy%d = %d; } else { _dummy%d = %d; }\n"
    };

    public DeadCodeInserter(CommonTokenStream tokens) {
        this.rewriter = new TokenStreamRewriter(tokens);
        this.tokens = tokens;
    }

    @Override
    public void enterProgram(MinicParser.ProgramContext ctx) {
        StringBuilder declarations = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            declarations.append(String.format("int _dummy%d;\n_dummy%d = 0;\n", i, i));
        }
        rewriter.insertBefore(ctx.getStart(), declarations.toString());
    }

    @Override
    public void enterDecOrFunDefinition(MinicParser.DecOrFunDefinitionContext ctx) {
        if (random.nextDouble() < 0.7) {
            for (int i = ctx.getStart().getTokenIndex(); i < tokens.size(); i++) {
                Token token = tokens.get(i);
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
        int templateIndex = random.nextInt(DEAD_CODE_TEMPLATES.length);
        int dummyNum = random.nextInt(10) + 1;

        return switch (templateIndex) {
            case 0 -> String.format(DEAD_CODE_TEMPLATES[0],
                    dummyNum, dummyNum, random.nextInt(100));
            case 1 -> String.format(DEAD_CODE_TEMPLATES[1],
                    dummyNum, random.nextInt(100), dummyNum, dummyNum);
            case 2 -> String.format(DEAD_CODE_TEMPLATES[2],
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