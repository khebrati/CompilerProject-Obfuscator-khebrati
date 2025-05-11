package test;

import gen.MinicLexer;
import gen.MinicParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.junit.Test;
import techniques.inliner.Inliner;
import techniques.renamer.VariableRenamer;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRunner {
    @Test
    public void convertAllTestFiles() throws IOException {
        var projectDir = System.getProperty("user.dir");
        Path casesDir = Paths.get(projectDir,"src","test","cases");

        if (!Files.exists(casesDir) || !Files.isDirectory(casesDir)) {
            throw new IllegalArgumentException("Cases directory not found at: " + casesDir.toAbsolutePath());
        }

        Map<String, String> fileContents = new HashMap<>();

        Files.walk(casesDir)
                .filter(Files::isRegularFile)
                .filter(file -> file.getFileName().toString().endsWith(".c"))
                .forEach(file -> {
                    try {
                        String content = Files.readString(file);

                        var obfuscated = obfuscate(content);
                        var testPath = file.getParent().getParent();
                        var targetFolder = testPath.resolve("target");
                        if (!Files.exists(targetFolder)) {
                            Files.createDirectory(targetFolder);
                        }
                        //todo change extension to mc
                        var targetFile = targetFolder.resolve(file.getFileName());
                        if(Files.exists(targetFile)){
                            Files.delete(targetFile);
                        }
                        Files.createFile(targetFile);
                        Files.writeString(targetFile, obfuscated);
                    } catch (IOException e) {
                        System.err.println("Error reading file: " + file + ": " + e.getMessage());
                    }
                });

    }

    private String obfuscate(String source){
        // Define a functional interface for the obfuscators
        interface Obfuscator {
            String apply(MinicParser.ProgramContext tree, CommonTokenStream tokens);
        }

        var obfuscators = List.<Obfuscator>of(
//                Inliner::inlineFunctions,
                VariableRenamer::renameVar
        );

        String convertedSource = source;
        for (var obfuscator : obfuscators) {
            var pair = getTokensTree(convertedSource);
            convertedSource = obfuscator.apply(pair.b, pair.a);
        }
        return convertedSource;
    }

    private Pair<CommonTokenStream,MinicParser.ProgramContext> getTokensTree(String source){
        var lexer = new MinicLexer(CharStreams.fromString(source));
        var tokens = new CommonTokenStream(lexer);
        var parser = new MinicParser(tokens);
        var tree = parser.program();
        return new Pair<>(tokens,tree);
    }

}