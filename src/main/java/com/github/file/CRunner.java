package com.github.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class CRunner {

    /**
     * A simple thread that consumes an InputStream and stores its content.
     */
    private static class StreamGobbler extends Thread {
        private final InputStream inputStream;
        private final StringBuilder content;

        public StreamGobbler(InputStream inputStream) {
            this.inputStream = inputStream;
            this.content = new StringBuilder();
        }

        @Override
        public void run() {
            new BufferedReader(new InputStreamReader(inputStream)).lines()
                    .forEach(line -> content.append(line).append("\n"));
        }

        public String getContent() {
            return content.toString();
        }
    }

    /**
     * Compiles and runs a C file, adding #include <stdio.h> if necessary.
     *
     * @param name The name of the C file (without the .c extension).
     * @return The standard output from the executed program.
     */
    public static String runFile(String name) {
        try {
            var projectDir = System.getProperty("user.dir");
            Path targetDir = Paths.get(projectDir, "src", "test", "java", "com", "github", "cases");

            if (!Files.exists(targetDir) || !Files.isDirectory(targetDir)) {
                System.err.println("Cases directory not found, creating one at: " + targetDir.toAbsolutePath());
                Files.createDirectories(targetDir);
            }

            return compileAndRun(name, targetDir);

        } catch (IOException | InterruptedException e) {
            Thread.currentThread().interrupt();
            // Re-throwing as a runtime exception to avoid forcing the caller to handle checked exceptions.
            throw new RuntimeException("Failed to compile and run C file: " + name, e);
        }
    }

    /**
     * Handles the file preprocessing, compilation, and execution.
     *
     * @param name      The name of the file.
     * @param targetDir The directory where the file is located.
     * @return The standard output from the executed program.
     * @throws IOException
     * @throws InterruptedException
     */
    private static String compileAndRun(String name, Path targetDir) throws IOException, InterruptedException {
        // --- 0. Preprocessing: Add #include if it doesn't exist ---
        Path cFile = targetDir.resolve(name + ".c");
        if (!Files.exists(cFile)) {
            throw new IOException("C source file not found: " + cFile.toAbsolutePath());
        }
        String originalCode = Files.readString(cFile, StandardCharsets.UTF_8);
        if (!originalCode.stripLeading().startsWith("#include <stdio.h>")) {
            String newCode = "#include <stdio.h>\n" + originalCode;
            Files.writeString(cFile, newCode, StandardCharsets.UTF_8);
            System.out.println("INFO: Added '#include <stdio.h>' to " + name + ".c");
        }

        // --- 1. Compilation Step ---
        System.out.println("--- Compiling " + name + ".c ---");
        ProcessBuilder compilePb = new ProcessBuilder("gcc", "-o", name, name + ".c");
        compilePb.directory(targetDir.toFile());
        Process compileProcess = compilePb.start();

        StreamGobbler compileErrorGobbler = new StreamGobbler(compileProcess.getErrorStream());
        compileErrorGobbler.start(); // Start consuming the error stream

        int compileExitCode = compileProcess.waitFor();
        compileErrorGobbler.join(); // Wait for the gobbler to finish

        if (compileExitCode != 0) {
            throw new RuntimeException("Compilation failed with exit code: " + compileExitCode
                    + "\n--- COMPILER ERRORS ---\n" + compileErrorGobbler.getContent());
        }
        System.out.println("Compilation successful.");

        // --- 2. Execution Step ---
        System.out.println("\n--- Running ./" + name + " ---");
        ProcessBuilder runPb = new ProcessBuilder("./" + name);
        runPb.directory(targetDir.toFile());
        Process runProcess = runPb.start();

        StreamGobbler outputGobbler = new StreamGobbler(runProcess.getInputStream());
        StreamGobbler errorGobbler = new StreamGobbler(runProcess.getErrorStream());
        outputGobbler.start();
        errorGobbler.start();

        int runExitCode = runProcess.waitFor();
        outputGobbler.join();
        errorGobbler.join();

        System.out.println("--- Execution finished ---");

        String runtimeErrors = errorGobbler.getContent();
        if (runExitCode != 0) {
            throw new RuntimeException("Execution failed with exit code: " + runExitCode
                    + "\n--- RUNTIME ERRORS ---\n" + runtimeErrors);
        }

        return outputGobbler.getContent();
    }
}

