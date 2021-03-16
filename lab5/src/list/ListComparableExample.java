package list;

import commons.ComparableStudent;
import commons.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListComparableExample {

    public static void main(String[] args) {

        //sort Comparable objects:
        List<ComparableStudent> comparableStudents = new ArrayList<>();
        comparableStudents.add(new ComparableStudent("Popescu", "Mihai", 8L));
        comparableStudents.add(new ComparableStudent("Ionescu", "Alex", 8L));
        comparableStudents.add(new ComparableStudent("Marinescu", "Alina", 9L));

        System.out.println(comparableStudents);
        Collections.sort(comparableStudents);
        System.out.println(comparableStudents);

        //sort using comparator:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3623);
        numbers.add(13);
        numbers.add(7);

        Collections.sort(numbers, new NumberComparator());

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(numbers); //[3623, 13, 7, 5, 1]

        //we can also use sort() from List interface:
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }
}
