#!/bin/bash

# Clean any previous builds
echo "Cleaning previous builds..."
rm -rf out target build

# Compile with javac
echo "Compiling Java files..."
mkdir -p out
javac -d out $(find src -name "*.java")

# Run the main class
echo "Running the application..."
java -cp out Bard

