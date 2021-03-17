package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String args[]) {
        // create a hash set
        Set<String> hs = new HashSet<>();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);

    }
}
