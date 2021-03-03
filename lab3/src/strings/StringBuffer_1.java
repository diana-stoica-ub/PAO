package strings;

public class StringBuffer_1 {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("A journey of a thousand miles ");
        stringBuffer.append("begins with a single step");
        System.out.println(stringBuffer);
        stringBuffer.replace(2,9, "walk");
        System.out.println(stringBuffer);
    }
}
