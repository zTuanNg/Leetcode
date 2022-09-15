package Homework;

import java.util.Arrays;

public class _283 {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        int l = nums.length;
        int i = 0;
        while (i < l) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < l; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[l - 1] = 0;
                l--;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

    }
}
