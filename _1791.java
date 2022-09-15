import java.util.HashMap;
import java.util.Map;

public class _1791 {

    public static void main(String[] args) {

    }

    public static int findCenter(int[][] edges) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int[] arr : edges) {
            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == edges.length) {
                return key;
            }
        }

        return -1;
    }
}
