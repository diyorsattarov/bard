package Bar;

public class Bar {
    public static void main() {
        System.out.println("hellobar");
        barObject();
        barString();
        barMath();
    }

    private static void barObject() {
        Object qux = new Object();
        System.out.println("barObject hashcode: " + qux.hashCode());
    }

    private static void barString() {
        String qux = "bar and qux";
        System.out.println("barString length: " + qux.length());
    }

    private static void barMath() {
        int foo = 5;
        int qux = 10;
        System.out.println("barMath max: " + Math.max(foo, qux));
    }
    /*
    private static void barSystem() {
        long quxT = System.currentTimeMillis();
                
    }
    */
}