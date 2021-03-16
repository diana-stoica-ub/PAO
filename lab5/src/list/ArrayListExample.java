package list;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        //ArrayList instantiation:
        List<String> vegetables = new ArrayList<>();

        //we can pass a list as parameter to the constructor
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange", "Grape"));

        fruits.add("Apple");                        // add element at the end of the array
        fruits.add(2, "Pear");          // add element at a specific index
                                                    // [Apple, Orange, Pear, Grape, Apple]

        System.out.println(fruits.get(3));          // get element from specific index
                                                    // if the value from the index is not set -> IndexOutOfBoundsException
                                                    // Grape

        fruits.set(1, "Cherry");                    // update value from a specific index
                                                    // [Apple, Cherry, Pear, Grape, Apple]

        fruits.remove(2);                      // remove value from a specific index
        System.out.println(fruits);                 // [Apple, Cherry, Grape, Apple]


        //iterate over ArrayList using for-each
        System.out.println("\nFor-each iteration:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");          // Apple Cherry Grape Apple
        }

        //iterate over ArrayList using iterator
        System.out.println("\nIterator iteration:");
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            //call to next() must be made before remove()
            if (fruit.equals("Apple")) {
                iterator.remove();
            }
        }
        System.out.println(fruits);                     //[Cherry, Grape]

        //iterate backwards using iterator
        System.out.println("Iterate backwards: ");
        ListIterator<String> backwardsIterator = fruits.listIterator(fruits.size());
        while (backwardsIterator.hasPrevious()) {
            System.out.print(backwardsIterator.previous() + " ");
        }
        System.out.println();                           //[Grape, Cherry]

        fruits.add("Blackberry");
        System.out.println(fruits);                     //[Cherry, Grape, Blackberry]

        Collections.sort(fruits);                       //can get a comparator as a second parameter
        System.out.println(fruits);                     //[Blackberry, Cherry, Grape]

        int grapeIndex = Collections.binarySearch(fruits, "Grape");
        if (grapeIndex >= 0) {
            System.out.println("Grape found at index: " + grapeIndex);
        } else {
            System.out.println("Grape not found");
        }

    }
}
