package homework;

import java.util.HashMap;
import java.util.Map;

public class _242 {
    public static void main(String[] args) {
        String s1 = "rat";
        String s2 = "car";
        System.out.println(isAnagram(s1, s2));

    }

    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> m1 = convertString(s);
        Map<Character, Integer> m2 = convertString(t);

        return m1.equals(m2);

    }

    public static Map<Character, Integer> convertString(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), (map.getOrDefault(s.charAt(i), 0)) + 1);
        }

        return map;
    }
}
