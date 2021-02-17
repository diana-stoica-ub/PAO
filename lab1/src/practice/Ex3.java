package practice;

import java.util.Scanner;

/**
 * Scrieți o metodă care returnează elementul n al secvenței Fibonacci.
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int current = 1;
        int precedent = 1;

        if (n < 1) {
            System.out.println("Please input a value >= 1");
            return;
        }

        for (int i = 2; i < n; i++) {
            int oldCurrent = current;
            current = current + precedent;
            precedent = oldCurrent;
        }

        System.out.println(current);
    }
}
