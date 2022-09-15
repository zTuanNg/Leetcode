package homework;

public class EX2 {
    static int sum;

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 11, 20};
        System.out.println(sum(arr, arr.length - 1));
        System.out.println(sum);

    }

    public static int sum(int[] arr, int l) {

        sum += arr[l];
        if (l == 0) {
            sum += arr[l];
            return sum;
        }
        return sum(arr, l - 1);

    }
}
