import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class _506 {
    public static void main(String[] args) {

    }

    public static String[] findRelativeRanks(int[] score) {

        String rs[] = new String[score.length];
        int position = 0;

        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            h.put(score[i], i);
        }
        Arrays.sort(score);


        for (int i = score.length - 1; i >= 0; i--) {
            if (i == score.length - 1) {
                rs[h.get(score[i])] = "Gold Medal";
            } else if (i == score.length - 2) {
                rs[h.get(score[i])] = "Silver Medal";
            } else if (i == score.length - 3) {
                rs[h.get(score[i])] = "Bronze Medal";
            } else {
                rs[h.get(score[i])] = String.valueOf(position + 1);
            }
            position++;
        }
        return rs;
    }
}
