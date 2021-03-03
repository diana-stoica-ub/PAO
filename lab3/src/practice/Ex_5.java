package practice;

/**
 * Write a Java program to remove the duplicate elements of a given array and
 * return the new length of the array.
 * [0-100]
 */
public class Ex_5 {

    public static void main(String[] args) {
        int[] array = {10, 7, 10, 5, 3, 4 , 6, 5};
        //Output: 10 7 5 3 4 6

        int[] app = new int[101];

        for (int value : array) {
            if (app[value] == 0) {
               System.out.println(value);
               app[value]++;
            }
        }
    }
}
