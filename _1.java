package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1 {
    public static void main(String[] args) {

        int[] arr = {3, 1, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));


    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (map.containsKey(value)) {
                if (value + value == target) {
                    result[0] = i;
                    result[1] = map.get(value);
                    return result;
                }
            } else {
                map.put(value, i);
            }
        }

        for (int key : map.keySet()) {
            int temp = target - key;
            if (map.containsKey(temp)) {
                result[0] = map.get(key);
                result[1] = map.get(temp);
            }
        }

        return result;
    }
}
