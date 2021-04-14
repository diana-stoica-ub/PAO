package ex2;

public class MessageRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from another thread!");
    }
}
