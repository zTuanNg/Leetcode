package homework;

import java.util.HashMap;
import java.util.Map;

public class _290 {
    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        Map<Character, String> map = new HashMap<>();

        if (arr.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (!map.containsValue(arr[i])) {
                    map.put(pattern.charAt(i), arr[i]);
                } else {
                    return false;
                }

            } else {

                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
