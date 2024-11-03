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

# Run the main class
echo "Running the application..."
java -cp out Bard

