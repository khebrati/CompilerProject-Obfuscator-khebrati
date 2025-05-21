# Obfusc2

A code obfuscation tool for C/Minic programs that applies multiple transformation techniques to make source code harder to understand while preserving functionality.

## Overview

Obfusc2 is a source-to-source transformation tool that takes C/Minic code as input and produces semantically equivalent but obfuscated code as output. The tool uses ANTLR4 for parsing and applies multiple obfuscation techniques in sequence.

## Obfuscation Techniques

The project implements several obfuscation strategies:

1. **Dead Code Insertion** - Adds syntactically valid but unreachable or ineffective code to confuse readers
2. **Variable Renaming** - Replaces meaningful variable names with random or confusing identifiers
3. **Expression Rewriting** - Transforms simple expressions into more complex but equivalent expressions

## Technology Stack

- Java 17 and Kotlin 1.9.22 for implementation
- ANTLR4 for parsing Minic language
- Maven for project management and building

## Interactive CLI Usage

The tool features an interactive command-line interface:

```bash
java -jar obfusc2.jar
```

### CLI Workflow

When you run the application, you'll be guided through the following steps:

1. A welcome header is displayed
2. You'll be prompted to enter the name of your mini-c code file
3. You can select which obfuscation technique(s) to apply:
    - Dead code insertion
    - Variable renaming
    - Expression rewriting
    - All techniques combined
4. The tool will process your file and save the obfuscated output
5. You can then choose to process another file or exit

### Example Session

```
      _____ _      __           _____
      |  _  | |    / _|         /  __ \
      | | | | |__ | |_ _   _ ___| /  \/
      | | | | '_ \|  _| | | / __| |
      \ \_/ / |_) | | | |_| \__ \ \__/\
      \___/|_.__/|_|  \__,_|___/\____/


This is a simple CLI for obfuscating your mini-c code, so no one else can read it (except you of course!).

Now tell me, what is the name of your mini-c code?: input.c

What obfuscation method do you want to use?
1. Dead code
2. Variable renaming
3. Expression rewriting
4. All!
Input the number: 4

✓
 Doing heavy obfuscation work... Done!

Your obfuscated code is ready! Check your test folder.

What next?
1. Choose another file
2. Exit
```

## Building from Source

```bash
# Clone the repository
git clone https://github.com/username/Obfusc2.git
cd Obfusc2

# Build with Maven
mvn clean package

# Run the application
java -jar target/Obfusc2-1.0-SNAPSHOT.jar
```

## Example

Original code:
```c
int factorial(int n) {
    if (n <= 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

Obfuscated code:
```c
int a_5fc3(int x_e45) {
    int _d = 42;
    if (_d > 100) { printf("unreachable"); }
    if ((x_e45 + 0) <= (1 * 1)) {
        if (1) { return 1; }
    } else {
        int _tmp = 0;
        while (_tmp < 0) { _tmp++; }
        return (x_e45) * (a_5fc3(x_e45 - 1));
    }
}
```