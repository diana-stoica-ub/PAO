package practice;


import practice.exceptions.NullElementException;
import practice.exceptions.OverflowException;

/**
 * Definiti o clasa Calculator care sa implementeze urmatoarele operatii
 *
 * adunarea a doua numere
 * scaderea a doua numere
 * inmultirea a doua numere
 * impartirea a doua numere
 *
 * Sa se trateze exceptiile ce pot aparea folosind exceptii custom (ex: nullcheks, overflow, underflow)
 *
 */
public class L6_Ex1 {


    public static void main(String[] args) {
        try {
            System.out.println(Calculator.add(10.4, 22.4));
            System.out.println(Calculator.add(null, null));
        } catch (NullElementException | OverflowException e) {
            System.out.println("Datele intorduse nu sunt valide: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
