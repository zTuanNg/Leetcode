import java.util.HashMap;
import java.util.Map;

public class _997 {

    public static void main(String[] args) {

        int[][] arr = {{1, 3}, {2, 3}};
        System.out.println(findJudge(2, arr));
    }

    public static int findJudge(int n, int[][] trust) {

        if (n == trust.length) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int[] arr : trust) {
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
        }

        for (int key : map.keySet()) {
            if (trust.length < 3) {
                if (map.get(key) == trust.length) {
                    for (int[] arr : trust) {
                        if (arr[0] == map.get(key)) {
                            return -1;
                        }

                    }
                    return key;
                }

            } else {
                if (map.get(key) == trust.length - 1) {
                    return key;
                }
            }

        }

        return -1;
    }
}
