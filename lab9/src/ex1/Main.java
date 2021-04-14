package ex1;

public class Main {

    // starting point of the main thread
    public static void main(String[] args) {
        System.out.println("Begin main");
        MessageThread helloThread = new MessageThread();
        helloThread.start(); // you want your thread here to begin the execution
        System.out.println("End main");
    }
}
