package practice;

import java.util.Arrays;

/**
 * Write a program to find the number of vowels, consonants,
 * digits and white space characters in a string.
 *
 * Input:
 * "This is 1 string"
 *
 * Output:
 * Vowels: 3
 * Consonants: 9
 * Digits: 1
 * Spaces: 3
 */
public class Ex_2 {

    public static void main(String[] args) {
        String vowels = "aeiou";
        String s = "This is 1 string";

        s = s.toLowerCase();

        int noOfSpaces = 0;
        int noOfVowels = 0;
        int noOfDigits = 0;
        int noOfConsonants = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                noOfSpaces++;
            } else if (Character.isDigit(s.charAt(i))) {
                noOfDigits++;
            } else if (Character.isAlphabetic(s.charAt(i))) {
                if (isVowel(s.charAt(i), vowels)) {
                    noOfVowels++;
                } else {
                    noOfConsonants++;
                }
            }
        }

        System.out.println("Vowels: " + noOfVowels);
        System.out.println("Consonants: " + noOfConsonants);
        System.out.println("Digits: " + noOfDigits);
        System.out.println("Spaces: " + noOfSpaces);
    }

    private static boolean isVowel(char c, String vowels) {
        return vowels.indexOf(c) >= 0;
    }

/*    public static boolean isDigit(char c) {
        return Character.compare('0', c) < 0
                && Character.compare('9', c) > 0;
    }*/
}
