cmake_minimum_required(VERSION 3.30)

# Project name and language
project(Bard VERSION 1.0 LANGUAGES NONE)

# Specify the Java source directory and the output directory
set(SOURCE_DIR "${CMAKE_SOURCE_DIR}/src/java")
set(OUTPUT_DIR "${CMAKE_BINARY_DIR}/out")

# Define the main class name as a macro
set(MAIN_CLASS "Bard")  # Change this to your main class name if needed

# Find all Java source files in the source directory
file(GLOB_RECURSE SOURCES "${SOURCE_DIR}/*.java")

# Custom target to compile Java files
add_custom_target(compile ALL
    COMMAND ${CMAKE_COMMAND} -E make_directory ${OUTPUT_DIR}
    COMMAND javac -d ${OUTPUT_DIR} ${SOURCES}
    COMMENT "Compiling Java source files..."
)

# Custom target to run the program
add_custom_target(run
    COMMAND java -cp ${OUTPUT_DIR} ${MAIN_CLASS}
    DEPENDS compile
    COMMENT "Running the Java application..."
)

# Additional target to delete the entire build directory if desired
add_custom_target(clean_all
    COMMAND ${CMAKE_COMMAND} -E rm -rf ${CMAKE_BINARY_DIR}
    COMMENT "Cleaning all build files including CMake-generated files..."
)

