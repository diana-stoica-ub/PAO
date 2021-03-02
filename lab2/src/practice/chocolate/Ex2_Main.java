package practice.chocolate;

/**
 * Implementeaza o clasa numita ChocolateBox, care va conține:
 * câmpurile private flavor (String) și origin (String)
 * un constructor fără parametri
 * un constructor ce va inițializa toate campurile
 * o metoda de tip float getVolume(), care va intoarce valoarea 0;
 * suprascrie metoda toString()
 *
 * Din ea derivați clasele Milka, Oreo, Merci, astfel:
 *
 * Milka va contine length, width, height
 * Oreo va conține un camp radius și unul height (cilindru)
 * Merci, fiind un cub, va conține un camp length
 * Clasele vor avea:
 *
 * constructori fără parametrii
 * constructori care permit inițializarea membrilor.
 * Suprascrieti metoda getVolume() pentru a intoarce volumul specific fiecarei cutii de ciocolata, in functie de tipul sau.
 * Suprascrieti metoda toString() în clasele derivate, astfel încat aceasta să utilizeze implementarea metodei toString() din clasa de bază.
 *
 * Suprascrieti metoda equals()
 */
public class Ex2_Main {

    public static void main(String[] args) {
        ChocolateBox box = new ChocolateBox("cherry", "Romania");
        System.out.println(box.toString());

        Milka milka = new Milka("milk", "Italy", 3.4f, 10f, 1.4f);
        System.out.println(milka.toString());
        System.out.println("Milka volume: " + milka.getVolume());

        Oreo oreo = new Oreo();
        System.out.println(oreo.toString());

        Oreo oreo2 = new Oreo("chocolate", "Ro", 10f, 30f);
        System.out.println(oreo2.toString());

        Merci merci = new Merci("coffee", "France", 3f);
        System.out.println(merci.getVolume());
    }
}
