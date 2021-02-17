package practice;

import java.util.Scanner;

/**
 * Scrieti un program java care citeste 3 numere de la tastatura si le compara
 *
 * Input:
 * Enter first number:
 * 10
 * Enter second number:
 * 27
 * Enter third number:
 * 5
 *
 * Output:
 * 5 < 10 < 27
 */
public class Ex2 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println(a + "==" + b + "==" + c);
        } else if (a == b) {
            if (a < c) {
                System.out.println(a + "<=" +  b + "<" + c);
            } else {
                System.out.println(c + "<" + a + "<=" + b);
            }
        } else if (b == c) {
            if (a > b) {
                System.out.println(b + "<=" + c + "<" + a);
            } else {
                System.out.println(a + "<" + b + "<=" +c);
            }
        } else if (a == c) {
            if (b < a) {
                System.out.println(b + "<" + a + "<=" + c);
            } else {
                System.out.println(a + "<=" + c + "<" + b);
            }
        } else if (a < b) {
            if (c < a) {
                System.out.println(c + " < " + a + " < " + b);
            } else if (c < b) {
                System.out.println(a + " < " + c + " < " + b);
            } else {
                System.out.println(a + " < " + b + " < " + c);
            }
        } else {
            if (c < b) {
                System.out.println(c + " < " + b + " < " + a);
            } else if (c > a) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }
        }

    }
}
