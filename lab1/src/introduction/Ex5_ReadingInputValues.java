package introduction;

import java.util.Scanner;

public class Ex5_ReadingInputValues {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // The Scanner class is used to get user input, and it is found in the java.util package.

        System.out.println("Enter a text:");
        String text = scanner.nextLine();
        System.out.println("Text: " + text + "\n");

        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        System.out.println("First number: " + a + "\n");

        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        System.out.print("Second number: " + b + "\n");

        System.out.print("a * b = " + a*b + "\n");

    }
}
