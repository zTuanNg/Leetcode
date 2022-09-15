package Homework;

import java.util.*;
import java.util.stream.Collectors;

public class _387 {
    public static void main(String[] args) {

        String str = "leetcode";
        System.out.println(firstUniqChar2(str));
        System.out.println(firstUniqChar1(str));

    }

    public static int firstUniqChar1(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        Map<Character, Integer> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        if ((Integer) result.values().toArray()[0] == 1) {
            String key = result.keySet().toArray()[0].toString();
            return s.indexOf(key);
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {

        int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[Integer.parseInt(Integer.toHexString(c), 16)] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[Integer.parseInt(Integer.toHexString(s.charAt(i)), 16)] == 1) {
                return i;
            }
        }
        return -1;
    }
}



