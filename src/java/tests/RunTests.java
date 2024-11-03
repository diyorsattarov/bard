package tests;

public class RunTests {
    public static void main(String[] args) {
        System.out.println("Running tests...");

        // Instantiate and run FooTest
        FooTest fooTest = new FooTest();
        fooTest.runTests(); // This will run all test methods in FooTest
    }
}

