package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class _1122 {
    public static void main(String[] args) {

        int[] arr1 = {2, 3, 1, 3, 2, 5, 4, 6};
        int[] arr2 = {3, 1, 2};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));


    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length];
        int index = 0;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : arr2) {
            for (int j = 0; j < map.get(i); j++) {
                result[index++] = i;

            }
            map.remove(i);
        }

        for (int i : map.keySet()) {
            for (int j = 0; j < map.get(i); j++) {
                result[index++] = i;
            }
        }

        return result;
    }

}
