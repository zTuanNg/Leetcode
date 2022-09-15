package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _804 {
    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));

    }

    public static int uniqueMorseRepresentations(String[] words) {

        String[] arr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 97), arr[i]);
        }

        if (words.length == 0) {
            return 0;
        }

        if (words.length == 1) {
            return 1;
        }

        for (String word : words) {
            String rs = "";
            for (int i = 0; i < word.length(); i++) {
                rs += map.get(word.charAt(i));
            }
            set.add(rs);
        }


        return set.size();
    }
}
