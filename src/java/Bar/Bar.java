package Bar;

public class Bar {
    public static void main() {
        System.out.println("hellobar");
        barObject();
        barString();
        barMath();
        barSystem();
        barThread();
    }
    
    // java.lang.Object
    private static void barObject() {
        Object qux = new Object();
        System.out.println("barObject hashcode: " + qux.hashCode());
    }

    // java.lang.String
    private static void barString() {
        String qux = "bar and qux";
        System.out.println("barString length: " + qux.length());
    }

    // java.lang.Math
    private static void barMath() {
        int foo = 5;
        int qux = 10;
        System.out.println("barMath max: " + Math.max(foo, qux));
    }
    
    // java.lang.System
    private static void barSystem() {
        long quxT = System.currentTimeMillis();
        System.out.println("barSystem time: " + quxT);           
    }
    
    // java.lang.Thread
    private static void barThread() { 
        Thread qux = new Thread(() -> System.out.println("barThread running"));
        qux.start();
    }
}
