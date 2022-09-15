import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _819 {
    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();

        for (String s : banned) {
            paragraph = paragraph.replace(s, " ");
        }

        String[] sym = {",", "?", "!", ".",";","'"};
        for (String s : sym) {
            paragraph = paragraph.replace(s, " ");
        }

        paragraph = paragraph.trim();
        String[] arr = paragraph.split("\\s+");
        String key = "";
        int value = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) > value) {
                value = map.get(s);
                key = s;
            }
        }

        return key;
    }


}
