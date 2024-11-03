import Foo.Foo;
import Bar.Bar;

class Bard {
    public static void main(String[] args) {
        System.out.println("helloworld");

        // Create an instance of Foo and start the server
        Foo fooServer = new Foo();
        fooServer.bar();

        // Demonstrate the functionality of Bar
        Bar.main();

        // Optionally, stop the server after a certain time or based on certain logic
        // Uncomment the lines below to stop the server after 5 seconds, for example
        /*
        try {
            Thread.sleep(5000); // wait for 5 seconds
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }
        fooServer.stop();
        */
    }
}

