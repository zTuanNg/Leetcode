package Homework;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _485 {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = cnt;
        for (int i : nums) {
            if (i == 1) {
                cnt++;
                if (cnt > max)
                    max = cnt;
            } else {
                cnt = 0;
            }
        }
        return max;
    }
}
