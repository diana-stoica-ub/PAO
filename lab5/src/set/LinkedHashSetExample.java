package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String args[]) {
        // create a hash set
        Set<String> hs = new LinkedHashSet<>();

        // add elements to the linked hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");

        //the order is preserved
        System.out.println(hs);
    }
}
