package Homework;

import java.util.*;

public class _1636 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 1, 4, 4, 4};

        System.out.println(Arrays.toString(frequencySort(nums)));


    }

    public static int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

//        System.out.println(map);

        List<Integer> lst = new ArrayList<>(map.keySet());

        Collections.sort(lst, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1) == map.get(o2)) {
                    return o2 - o1;
                } else {
                    return map.get(o1) - map.get(o2);
                }
            }
        });

//        System.out.println(lst);

        int[] result = new int[nums.length];
        int i = 0;
        for (int num : lst) {
            for (int j = 0; j < map.get(num); j++) {
                result[i] = num;
                i++;
            }
        }
        return result;
    }
}
