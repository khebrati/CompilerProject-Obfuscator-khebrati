package com.github.techniques.deObfuscate;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import com.github.techniques.deObfuscate.expression.ExpressionSimplifier;
import com.github.techniques.deObfuscate.rename.NameSimplifier;
import com.github.techniques.obfuscate.renamer.NameObfuscator;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class DeObfuscateRunner {
    public static String runTechnique(DeObfusTechnique tech, String content){
        interface DeObfuscator {
            String apply(MinicParser.ProgramContext tree, CommonTokenStream tokens);
        }
        ArrayList<DeObfuscator> deObfuscators = new ArrayList<>();
        switch (tech) {
            case SIMPLIFY_EXPRESSION:
                deObfuscators.add(ExpressionSimplifier::simplify);
                break;
            case RENAMER:
                deObfuscators.add(NameSimplifier::rename);
                break;
            case ALL:
                deObfuscators.add(ExpressionSimplifier::simplify);
                break;
        }
        for (var obf : deObfuscators) {
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

