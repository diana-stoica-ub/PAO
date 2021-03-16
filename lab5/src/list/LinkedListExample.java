package list;

import commons.Student;

import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("Popescu", "Mihai", 8L));
        students.add(new Student("Ionescu", "Alex", 8L));
        students.add(new Student("Marinescu", "Alina", 9L));

        //iterate in a descendent order
        Iterator<Student> descIterator = students.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }
        System.out.println();

        System.out.println("First element: " + students.getFirst());
        System.out.println("Last element: " + students.getLast());

        //we can convert from List to regular arrays ([])
        List<Integer> ints = new LinkedList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        //convert from List to regular arrays ([])
        Integer[] intsArray = (Integer[]) ints.toArray();

        //convert from regular arrays to list
        ints = Arrays.asList(intsArray);
    }
}
