package com.github.techniques;

import com.github.file.FileHandling;
import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import com.github.techniques.deadcode.DeadCodeInserter;
import com.github.techniques.expression.ExpressionRewriter;
import com.github.techniques.renamer.VariableRenamer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class Runner {
    public static String runTechnique(Techniques tech,String content){
        interface Obfuscator {
            String apply(MinicParser.ProgramContext tree, CommonTokenStream tokens);
        }
        ArrayList<Obfuscator> obfuscators = new ArrayList<>();
        switch (tech) {
            case NAME_CHANGER:
                obfuscators.add(VariableRenamer::renameVar);
                break;
            case DEAD_CODE:
                obfuscators.add(DeadCodeInserter::insertDeadCode);
                break;
            case EXPRESSION:
                obfuscators.add(ExpressionRewriter::rewriteExpressions);
                break;
            case ALL:
                obfuscators.add(DeadCodeInserter::insertDeadCode);
                obfuscators.add(VariableRenamer::renameVar);
                obfuscators.add(ExpressionRewriter::rewriteExpressions);
                break;
        }
        for (var obf : obfuscators) {
            var pair = getTokensTree(content);
            content = obf.apply(pair.b,pair.a);
        }
        return content;
    }

    public static Pair<CommonTokenStream, MinicParser.ProgramContext> getTokensTree(String source){
        var lexer = new MinicLexer(CharStreams.fromString(source));
        var tokens = new CommonTokenStream(lexer);
        var parser = new MinicParser(tokens);
        var tree = parser.program();
        return new Pair<>(tokens,tree);
    }
}

