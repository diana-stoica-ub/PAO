package practice;

import java.util.Scanner;

/**
 * Scrieți o metodă care verifică dacă un număr este număr prim.
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i ++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Este prim");
        } else {
            System.out.println("Nu este prim");
        }
    }
}
