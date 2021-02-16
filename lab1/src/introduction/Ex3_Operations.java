package introduction;

public class Ex3_Operations {

    public static void main(String[] args) {
        // operatori de comparare: < > <= >= == !=
        // < > <= >= --- folositi cu tip de date numeric

        boolean b1 = true == false;
        boolean b2 = 3 > 10;

        int x = 10;
        int y = 20;

        boolean b3 = y <= x;

        // operatorii de comparare sunt folositi ca si conditii in structurile de control
        // structurile de control ne ajuta sa luam decizii / repetam instructiuni

        if (x > y) { // conditia trebuie sa fie boolean
            System.out.println(x + ">" + y);
        } else {
            System.out.println(x + "<" + y);
        }

        while (x < y) {
            System.out.println(x + "<" + y);
            x += 1; // <=> x = x+1
        }


        int a = 23;
        int b = 10;
        int c = a + b;
        System.out.println(c);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
