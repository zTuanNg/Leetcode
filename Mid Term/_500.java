import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _500 {

    public static void main(String[] args) {

        String[] words = {"zZxcvbnm"};
        System.out.println(Arrays.toString(findWords(words)));


    }

    public static String[] findWords(String[] words) {

        String[] str = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> rs = new ArrayList<>();
        int idx = 0;

        for (String word : words) {
            if (word.length() == 1) {
                rs.add(word);
            } else {
                String lowerStr = word.toLowerCase();

                if (str[0].contains(String.valueOf(lowerStr.charAt(0)))) {
                    idx = 0;
                }
                if (str[1].contains(String.valueOf(lowerStr.charAt(0)))) {
                    idx = 1;
                }
                if (str[2].contains(String.valueOf(lowerStr.charAt(0)))) {
                    idx = 2;
                }

                for (int i = 1; i < lowerStr.length(); i++) {

                    String temp = String.valueOf(lowerStr.charAt(i));
                    if (!str[idx].contains(temp)) {
                        break;
                    }
                    if (i == lowerStr.length() - 1) {
                        rs.add(word);
                    }
                }
            }

        }


        String[] result = new String[rs.size()];
        int index = 0;
        for (String w : rs) {
            result[index] = w;
            index++;
        }

        return result;
    }
}
