package tests;

import java.lang.reflect.Method;

public abstract class TestSuite {
    // Method to run all test methods in a test class
    public void runTests() {
        try {
            setup(); // Run setup before any test
            int passed = 0;
            int failed = 0;

            // Reflectively call each method starting with "test"
            for (Method method : this.getClass().getMethods()) {
                if (method.getName().startsWith("test")) {
                    try {
                        method.invoke(this);
                        System.out.println("Test " + method.getName() + " PASSED");
                        passed++;
                    } catch (Exception e) {
                        System.out.println("Test " + method.getName() + " FAILED: " + e.getCause());
                        failed++;
                    }
                }
            }

            teardown(); // Run teardown after all tests
            System.out.println("\nTests completed: " + (passed + failed));
            System.out.println("Passed: " + passed);
            System.out.println("Failed: " + failed);

        } catch (Exception e) {
            System.out.println("Error running tests: " + e.getMessage());
        }
    }

    // Override these methods in the test class as needed
    public void setup() {}
    public void teardown() {}

    // Assertion utility methods
    public void assertTrue(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    public void assertEquals(Object expected, Object actual, String message) {
        if (!expected.equals(actual)) throw new AssertionError(message);
    }
}

