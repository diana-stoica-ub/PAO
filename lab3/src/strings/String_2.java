package strings;

public class String_2 {

    public static void main(String[] args) {
        String s1 = "this is a String";

        s1.toUpperCase();
        System.out.println(s1);

        String s2 = s1.toUpperCase();
        System.out.println(s2);

        System.out.println(s1.replace('s', '$'));
        System.out.println("Length" + s1.length());
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.indexOf('S'));

        String[] strings = s1.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        String substring = s1.substring(5, 10);
        System.out.println("Substring: " + substring);

    }
}
