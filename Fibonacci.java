package Homework;

public class Fibonacci {
    public static void main(String[] args) {

        // 1 2 3 5 8 13 21 34 55
        System.out.println(fiboWithoutRecursion(5));
        System.out.println(fiboWithRecursion(5));
    }

    public static int fiboWithoutRecursion(int n) {
        int[] arr = new int[n];

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (n > 2) {
            arr[0] = 1;
            arr[1] = 2;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        return arr[n - 1];
    }

    public static int fiboWithRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fiboWithRecursion(n - 1) + fiboWithRecursion(n - 2);
    }
}
