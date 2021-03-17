package practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Se citesc de la tastatura n numere
 * Sa se calculeze media aritmetica a acestora si sa se stearga cele mai mici decat aceasta
 * Apoi, sa se printeze
 */
public class Ex_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new LinkedList<>();
        int ma = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
            ma += number;
        }
        ma /= n;

        System.out.println("Ma: " + ma);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number < ma) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
