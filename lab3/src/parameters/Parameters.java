package parameters;

public class Parameters {

    static void changeReference(Student st) {
        st = new Student("Bob", 10);
    }

    static void changeObject(Student st) {
        st.setAverageGrade(10);
    }

    static void changePrimitive(int value) {
        value = 15;
    }

    public static void main(String[] args) {
        Student s = new Student("Alice", 5);
        changeReference(s);
        System.out.println(s);

        changeObject(s);
        System.out.println(s);

        int value = 10;
        changePrimitive(value);
        System.out.println(value);
    }
}
