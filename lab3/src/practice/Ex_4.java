package practice;

import java.util.Arrays;

/**
 * Write a Java program to find a missing number in an array
 * If one of the margins is missing -> print an error message
 *
 * Input:
 *
 * [5, 8, 7, 10, 9]
 *
 * Output:
 * 6
 */
public class Ex_4 {

    public static void main(String[] args) {
        int[] array = {5, 8, 7, 10, 9};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            sum += value;
        }

        int result = (max * (max + 1) / 2) - (min * (min - 1) / 2) - sum;

        System.out.println(result);


        /*Arrays.sort(array);
        for (int i = array[0]; i < array[array.length - 1]; i++) {
            if (Arrays.binarySearch(array, i) < 0) {
                System.out.println(i);
            }
        }*/
    }
}
