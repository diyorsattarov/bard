# Find all .java files in src/ recursively
SOURCES := $(shell find src -name "*.java")

# Target to build all .class files
all:
	mkdir -p out
	javac -d out $(SOURCES)

# Clean up all compiled .class files
clean:
	rm -rf out

# Run target to execute the compiled program
run: all
	java -cp out main

