package exceptions;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println(f());
    }

    private static int f() {
        try {
            throw new RuntimeException("Exception");
        } catch (RuntimeException e) {
            return 1;
        } finally {
            //bad practice!
            return 2;
        }
    }
}
