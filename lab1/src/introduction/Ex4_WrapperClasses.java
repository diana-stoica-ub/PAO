package introduction;

/**
 * Clasele Wrapper sunt folosite pentru a folosi primitivele pe post de obiecte, atunci cand este necesar
 *
 * Primitive Data Type  |  Wrapper Class
 * - byte                   Byte
 * - short                  Short
 * - int                    Integer
 * - long                   Long
 * - float                  Float
 * - double                 Double
 * - boolean                Boolean
 * - char                   Characte
 */
public class Ex4_WrapperClasses {

    public static void main(String[] args) {
        Integer intWrapped = 5; //Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        Double doubleWrapped = 5.99;
        Character charWrapped = 'A';

        System.out.println(intWrapped.intValue());
        System.out.println(doubleWrapped.doubleValue());
        System.out.println(charWrapped.charValue());

        int intPrimitive = 10;
        System.out.print(Integer.valueOf(intPrimitive));
        char charPrimitive = Character.valueOf('C'); //If the conversion goes the other way, this is called unboxing.
    }
}
