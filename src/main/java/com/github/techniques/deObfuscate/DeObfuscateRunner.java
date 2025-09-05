package com.github.techniques.deObfuscate;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import com.github.techniques.obfuscate.ObfusTechnique;
import com.github.techniques.obfuscate.deadcode.DeadCodeInserter;
import com.github.techniques.obfuscate.expression.ExpressionObfuscator;
import com.github.techniques.obfuscate.renamer.Renamer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class DeObfuscateRunner {
    public static String runTechnique(ObfusTechnique tech, String content){
        interface Obfuscator {
            String apply(MinicParser.ProgramContext tree, CommonTokenStream tokens);
        }
        ArrayList<Obfuscator> obfuscators = new ArrayList<>();
        switch (tech) {
            case NAME_CHANGER:
                obfuscators.add(Renamer::renameVar);
                break;
            case DEAD_CODE:
                obfuscators.add(DeadCodeInserter::insertDeadCode);
                break;
            case EXPRESSION:
                obfuscators.add(ExpressionObfuscator::rewriteExpressions);
                break;
            case ALL:
                obfuscators.add(DeadCodeInserter::insertDeadCode);
                obfuscators.add(Renamer::renameVar);
                obfuscators.add(ExpressionObfuscator::rewriteExpressions);
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

