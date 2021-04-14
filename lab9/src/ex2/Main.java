package ex2;

public class Main {

    // starting point of the main thread
    public static void main(String[] args) {
        Thread helloThread = new Thread(new MessageRunnable());
        helloThread.start();
        System.out.println("End main!");
    }
}
