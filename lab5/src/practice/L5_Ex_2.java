package practice;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Se da un string
 * Sa se afiseze numarul de aparitii pt fiecare litera
 *
 * Input:
 * "abracadabra":
 *
 * Output:
 * a: 5
 * b: 2
 * c: 1
 * d: 1
 * r: 2
 */
public class L5_Ex_2 {
    public static void main(String[] args) {
        String string = "abracadabra";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        System.out.println(map);
    }


}
