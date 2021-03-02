package practice.complex;


/**
 * Să se creeze o clasă numită Complex, care are doi membri de tip int (real și imaginary),
 * care vor fi private. Realizați următoarele subpuncte:
 *
 * să se creeze trei constructori: primul primește doi parametri de tip int
 * (primul desemnează partea reală a unui număr complex, al doilea partea imaginară),
 * al doilea nu primește niciun parametru și apelează primul constructor cu valorile 0 și 0,
 * să se scrie metode de tip getter și setter, prin care putem accesa membrii privați ai clasei
 * să se scrie o metodă de tip void numită addWithComplex, care primește ca parametru un
 * obiect de tip Complex, prin care se adună numărul complex dat ca parametru la numărul
 * care apelează funcția (adică la this)
 * să se scrie o metodă de tip void numita showNumber, prin care se afișează numărul complex
 */
public class Ex1_Main {

    public static void main(String[] args) {

        Complex complex = new Complex(3, 10);
        complex.showNumber();

        Complex complex2 = new Complex(5, 7);
        complex.addWithComplex(complex2);
        complex.showNumber();

        Complex complex3 = Complex.sumOfComplex(complex, complex2);
        complex3.showNumber();
    }
}
