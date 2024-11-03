#!/bin/bash

# Check for optional 'clean' argument
if [[ $1 == "clean" ]]; then
    echo "Cleaning previous builds..."
    rm -rf out target build
    exit 0
fi

# Compile with javac
echo "Compiling Java files..."
mkdir -p out
javac -d out $(find src -name "*.java")

# Run the specified target (main application or tests)
if [[ $1 == "test" ]]; then
    echo "Running the test suite..."
    java -cp out tests.RunTests
else
    echo "Running the application..."
    java -cp out Bard
fi

