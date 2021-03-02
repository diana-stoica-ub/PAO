package strings;

public class StringBuilder_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A journey of a thousand miles ");
        sb.append("begins with a single step");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }

}
