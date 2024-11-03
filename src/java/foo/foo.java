package Foo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Foo {
    private static final int qux = 12345;
    private Thread fooThread;
    private boolean baz;

    // Method to start the bar in a new thread
    public void bar() {
        if (fooThread != null && fooThread.isAlive()) {
            System.out.println("Bar is already running.");
            return;
        }

        baz = true;
        fooThread = new Thread(this::quux);
        fooThread.start();
    }

    // Method to stop the bar
    public void quuz() {
        baz = false;
        try {
            if (fooThread != null) {
                fooThread.join();
            }
            System.out.println("Bar stopped.");
        } catch (InterruptedException e) {
            System.out.println("Error stopping bar: " + e.getMessage());
        }
    }

    // Logic encapsulated in a method
    private void quux() {
        try (ServerSocket fooBaz = new ServerSocket(qux)) {
            System.out.println("Bar started on qux " + qux);

            while (baz) {
                try (Socket barBaz = fooBaz.accept();
                     BufferedReader fooIn = new BufferedReader(new InputStreamReader(barBaz.getInputStream()));
                     PrintWriter fooOut = new PrintWriter(barBaz.getOutputStream(), true)) {

                    System.out.println("Qux connected.");

                    // Read input
                    String barMsg = fooIn.readLine();
                    if (barMsg == null) continue;
                    System.out.println("Received qux: " + barMsg);

                    // Send a response back
                    String bazResponse = "Response: " + barMsg.toUpperCase();
                    fooOut.println(bazResponse);

                } catch (Exception e) {
                    System.out.println("Error handling qux: " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("Bar error: " + e.getMessage());
        }
    }
}

