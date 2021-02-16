package introduction;

import java.util.Random;

/**
 * 'class' = cuvant cheie ce semnaleaza definitia unei clase
 * De obicei, clasa este definita intr-un fisier cu acelasi nume (insa nu intotdeauna)
 * Ex1_Structure = numele clasei
 * Reguli:
 * - nu poate incepe cu numere (dar poate contine numere)
 * - nu poate coincide cu cuvinte cheie (eg: 'package')
 * - nu poate contine spatii si caractere speciale (exceptie "$" si "_")
 * Conventii
 * - camel case
 * - incepe cu litera mare
 * - substantive
 *
 * Clasele din Java sunt organizate in pachete.
 * Cuvantul cheie 'package' => de obicei pe prima linie, si defineste pachetul in care se afla clasa
 * Clasa Ex0_HelloWorld nu are nici un package definit => este inclusa in pachetul implicit, numit "default"
 * Ca si buna practica, este bine sa denumim intotdeauna pachetele.
 *
 * Pentru a folosi clase din alte pachete fata de cel curent => folosim cuvantul cheie import
 * java.lang => pachet special din Java ce nu trebuie importat
 * (de exemplu, clasa System folosita pentru a printa mesaje in consola, face parte din acest pachet)
 */
public class Ex1_Structure {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        System.out.println(randomNumberGenerator.nextInt());
    }
}
