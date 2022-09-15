package homework;

// not found x -> return -1

public class EX1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 7};
        System.out.println(findX(arr, arr.length - 1, 4));
    }

    public static int findX(int[] arr, int l, int x) {
        if (l == 0) {
            if (arr[l] == x) {
                return arr[l];
            }
            return -1;
        }

        if (arr[l] == x) {
            return arr[l];
        }
        return findX(arr, l - 1, x);
    }
}
