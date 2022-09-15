package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1051 {
    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(heightChecker(arr));
    }

    public static int heightChecker(int[] heights) {
        int cnt = 0;
        int[] arr = heights.clone();
        for (int i = 1; i < heights.length; i++) {
            int j = i - 1;
            int k = i;
            if (heights[k] < heights[j]) {
                while (heights[k] < heights[j]) {
                    int temp = heights[k];
                    heights[k] = heights[j];
                    heights[j] = temp;

                    if (j == 0) {
                        break;
                    } else {
                        k--;
                        j--;
                    }
                }
            }
        }

        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}
