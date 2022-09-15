package homework;

import java.util.Arrays;

public class _912 {
    public static void main(String[] args) {

        int[] a = {5, 1, 6, 2, 3, 4};
        divide(a, a.length);
        System.out.println(Arrays.toString(a));

    }

    public static void divide(int[] a, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] lArr = new int[mid];
        int[] rArr = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            lArr[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            rArr[i - mid] = a[i];
        }

        divide(lArr, mid);
        divide(rArr, n - mid);
        conquer(a, lArr, rArr, mid, n - mid);

    }

    public static void conquer(int[] a, int[] lArr, int[] rArr, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (lArr[i] <= rArr[j]) {
                a[k++] = lArr[i++];
            } else {
                a[k++] = rArr[j++];
            }
        }
        while (i < left) {
            a[k++] = lArr[i++];
        }
        while (j < right) {
            a[k++] = rArr[j++];
        }
    }
}
