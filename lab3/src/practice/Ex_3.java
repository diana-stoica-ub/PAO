package practice;

import java.util.Arrays;

/**
 * Input a string of letters.
 * Find out the number of occurrence of each letter in that string.
 * Print them in lexicographical order
 *
 * Input:
 * "abracadabra:
 *
 * Output:
 * a: 5
 * b: 2
 * c: 1
 * d: 1
 * r: 2
 */
public class Ex_3 {

    public static void main(String[] args) {
        String s = "abracadabraaz";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        int noOfApp = 1;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                noOfApp++;
            } else {
                System.out.println(chars[i] + " " + noOfApp);
                noOfApp = 1;
            }
        }

        System.out.println(chars[chars.length - 1] + " " + noOfApp);
    }
}
