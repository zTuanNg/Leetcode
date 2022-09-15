package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class _1002 {
    public static void main(String[] args) {

//        System.out.println((int)'z'-(int)'a');

        String[] lst = {"bella", "label", "roller"};

        System.out.println(commonChars(lst));

    }

    public static List<String> commonChars(String[] words) {

        List<String> result = new ArrayList<>();

        int[] minValue = new int[26];
        Arrays.fill(minValue, Integer.MAX_VALUE);

        for (String s : words) {
            int[] countArr = new int[26];
            for (char c : s.toCharArray()) {
                countArr[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minValue[i] = Math.min(minValue[i], countArr[i]);
            }
        }

        for (int i = 0; i < 26; i++) {

            while (minValue[i] > 0) {
                result.add(String.valueOf((char) (i + (int) 'a')));
                minValue[i]--;
            }
        }

        return result;
    }
}
