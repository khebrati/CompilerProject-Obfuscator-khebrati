package com.github.test;

import com.github.gen.MinicLexer;
import com.github.gen.MinicParser;
import com.github.techniques.deadcode.DeadCodeInserter;
import com.github.techniques.expression.ExpressionRewriter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import com.github.techniques.renamer.VariableRenamer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestRunner {
    @Test
    public void convertAllTestFiles() throws IOException {
        var projectDir = System.getProperty("user.dir");
        Path casesDir = Paths.get(projectDir, "src", "main", "java", "com", "github", "test", "cases");

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

                        // Print debug information
                        System.out.println("Processed file: " + file.getFileName());
                        System.out.println("Original content:\n" + content);
                        System.out.println("Obfuscated content:\n" + obfuscated);

                    } catch (IOException e) {
                        System.err.println("Error processing file: " + file + ": " + e.getMessage());
                    }
                });
    }

    private String obfuscate(String source) {
        // Create initial lexer and parser
        MinicLexer lexer = new MinicLexer(CharStreams.fromString(source));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MinicParser parser = new MinicParser(tokens);
        MinicParser.ProgramContext tree = parser.program();

        // Apply transformations in sequence
        String result = source;

        // Expression rewriting
        result = ExpressionRewriter.rewriteExpressions(tree, tokens);

        // Create new parser for dead code insertion
        lexer = new MinicLexer(CharStreams.fromString(result));
        tokens = new CommonTokenStream(lexer);
        parser = new MinicParser(tokens);
        tree = parser.program();
        result = DeadCodeInserter.insertDeadCode(tree, tokens);

        // Create new parser for variable renaming
        lexer = new MinicLexer(CharStreams.fromString(result));
        tokens = new CommonTokenStream(lexer);
        parser = new MinicParser(tokens);
        tree = parser.program();
        result = VariableRenamer.renameVar(tree, tokens);

        return result;
    }
}