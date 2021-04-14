package ex4;

import java.util.Arrays;
import java.util.List;

public class SleepMessagesWithInterrupts {
    public static void main(String[] args) throws InterruptedException {
        List<String> info = Arrays.asList("Hello", "there", "Hi", "again!");
        for (String s : info) {
            // Pause for 2 seconds
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages.
                return;
            }
            // Print a message
            System.out.println(s);
        }
    }
}
