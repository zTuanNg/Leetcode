package Homework;

import java.util.Arrays;

public class _1089 {
    public static void main(String[] args) {

        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
//        output : 1 0 0 2 3 0 0 4
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}
