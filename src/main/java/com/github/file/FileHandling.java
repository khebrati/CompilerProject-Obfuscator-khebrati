package com.github.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {
    public static String readFile(String name) throws IOException {

        var projectDir = System.getProperty("user.dir");
        Path casesDir = Paths.get(projectDir, "src", "test", "java", "com", "github", "cases");

        if (!Files.exists(casesDir) || !Files.isDirectory(casesDir)) {
            throw new IllegalArgumentException("Cases directory not found at: " + casesDir.toAbsolutePath());
        }

        return Files.readString(Path.of(casesDir.toString(),name));
    }

    public static void writeFile(String name, String content) throws IOException {
        var projectDir = System.getProperty("user.dir");
        Path targetDir = Paths.get(projectDir, "src", "test", "java", "com", "github", "target");

        if (!Files.exists(targetDir) || !Files.isDirectory(targetDir)) {
            throw new IllegalArgumentException("Cases directory not found at: " + targetDir.toAbsolutePath());
        }

        Files.writeString(Path.of(targetDir.toString(),name),content);
    }


}
