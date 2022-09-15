public class findMaxByRecursion {
    static int max = 0;

    public static void main(String[] args) {

        int[] arr = {11, 9, 7, 5, 1, 4};
        System.out.println(findMax(arr, arr.length - 1));

    }

    public static int findMax(int[] arr, int n) {
        if (arr[n] > max) {
            max = arr[n];
        }
        if (n == 0) {
            return max;
        }
        return findMax(arr, n - 1);
    }

}
