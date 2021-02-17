package practice;

/**
 * Scrieți un program Java care afișează numerele divizibile cu 3 de la 1 la 99.
 */
public class Ex1 {

    public static void main(String[] args) {
        for (int i = 0; i< 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
