package com.github;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import com.github.techniques.deadcode.DeadCodeInserter;
import com.github.techniques.expression.ExpressionRewriter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Pair;
import org.junit.Test;
import com.github.techniques.renamer.VariableRenamer;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class TestRunner {
    @Test
    public void convertAllTestFiles() throws IOException {
        var projectDir = System.getProperty("user.dir");
        Path casesDir = Paths.get(projectDir, "src", "test", "java", "com", "github", "cases");

        if (!Files.exists(casesDir) || !Files.isDirectory(casesDir)) {
            throw new IllegalArgumentException("Cases directory not found at: " + casesDir.toAbsolutePath());
        }

        Files.walk(casesDir)
                .filter(Files::isRegularFile)
                .filter(file -> file.getFileName().toString().endsWith(".c"))
                .forEach(file -> {
                    try {
                        String content = Files.readString(file);
                        String obfuscated = obfuscate(content);

                        Path testPath = file.getParent().getParent();
                        Path targetFolder = testPath.resolve("target");
                        if (!Files.exists(targetFolder)) {
                            Files.createDirectories(targetFolder);
                        }

                        Path targetFile = targetFolder.resolve(file.getFileName());
                        Files.writeString(targetFile, obfuscated);
                        addStdioHeader(targetFile);
                        changeFileExtension(targetFile, ".mc");
                        System.out.println("Obfuscated file written to: " + targetFile.toAbsolutePath());
                    } catch (IOException e) {
                        System.err.println("Error processing file: " + file + ": " + e.getMessage());
                    }
                });
    }

    private void addStdioHeader(Path source){
        // Add stdio.h header to the beginning of the file
        String header = "#include <stdio.h>\n";
        try {
            String content = Files.readString(source);
            Files.writeString(source, header + content);
        } catch (IOException e) {
            System.err.println("Error adding header to file: " + source + ": " + e.getMessage());
        }
    }

    private void changeFileExtension(Path file, String newExtension) throws IOException {
        Path newFile = Paths.get(file.toString().replaceFirst("[.][^.]+$", "") + newExtension);
        Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);
    }

    private String obfuscate(String source){
        // Define a functional interface for the obfuscators
        interface Obfuscator {
            String apply(MinicParser.ProgramContext tree, CommonTokenStream tokens);
        }

        var obfuscators = List.<Obfuscator>of(
                DeadCodeInserter::insertDeadCode,
                VariableRenamer::renameVar,
                ExpressionRewriter::rewriteExpressions
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