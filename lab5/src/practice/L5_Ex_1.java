package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Se da un String;
 * sa se elimine literele duplicate
 */
public class L5_Ex_1 {


    public static void main(String[] args) {
        String str = "abtracadabra";

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.println(set);
    }
}
