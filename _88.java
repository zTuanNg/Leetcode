package Homework;

import java.util.Arrays;

public class _88 {
    public static void main(String[] args) {
        int[] nums1 = {0, 3, 7, 0, 0, 0};
        int[] nums2 = {1, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[l] = nums2[n - 1];
                n--;
            } else {
                nums1[l] = nums1[m - 1];
                m--;
            }
            l--;
        }
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
    }
}
