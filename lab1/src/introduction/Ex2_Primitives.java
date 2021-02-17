package introduction;

/**
 * Pentru a lucra cu date avem nevoie de zone de memorie, iar pentru a lucra cu zone dememorie în limbajul Java trebuie
 * sa ne gandim la tipul de date stocat: numere, valori de adevărat sau fals, caractere sau obiecte.
 * Numerele, valorile de adevărat sau fals și caracterele sunt numite ​tipuri primitive.
 * =>byte, short, int, long, float, double, char, boolean
 * Sirul de caractere (String) nu este tip primitiv!
 * Primitivele sunt tipuri de date din java care nu sunt obiecte! (obiect = instanta a unei clase)
 * Pentru ca are primitive, Java nu este un limbaj OOP 'pur'
 *
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class Ex2_Primitives {

    public static void main(String[] args) {
        // tip identificator
        // byte, short, int, long, float, double, char, boolean
        // String --- nu este primitiv

        byte q1; // declarare zona memorie
        // 8-bit signed integer. Can hold values from -128 to 127
        q1 = 10; // pentru a da o valoare zonei de memorie se foloseste operatorul "="

        short s1 = 10;  //16-bit signed integer. Can hold values from -32,768 to 32,767
        int i = 10;     //32-bit signed integer. Can hold values from -2,147,483,648 to 2,147,483,647
        long a = 10;    //64-bit integer. Can hold really big numbers (-2^63 to 2^63–1)

        // Octal declaration starts with 0 and possible chars are [0-7]
        int i2 = 054; // baza 8
        // HexaDecimal declaration starts with 0X or 0x and possible chars are [0-9A-Fa-f]
        int i3 = 0XFF; // baza 16
        int i4 = 0xFF; // baza 16
        // Binary representation starts with 0B or 0b and possible chars are [0-1]
        int i5 = 0b10110;

        long b = 9999999999999L; // L = literal

        double d1 = 10.5;   //64 bit

        float f1 = 10.5F; // diferenta dintre double si float este de precizie (nr zecimale dupa virgula); 32 bit
        float f2 = (float) 10.5; // In Java orice valoare cu virgula este considerata de tip double => folosim un literal (f,F) sau operatorul de conversie

        int f3 = (int) 10.5;

        boolean k1 = false;     //1 bit
        boolean k2 = true;
        // true, false = cuvinte cheie (keywords)

        char w1 = 'a'; // caracterele in Java se pun intre ghilimele simple ''; 16-bit Unicode character.
        char w2 = '\n';
        char w3 = '\u1011';
        System.out.print(w3);

        int r1, r2, r3; // se pot declara mai multe zone de memorie cu virgula intre ele
        int r4, r5 = 10, r6;
    }
}
