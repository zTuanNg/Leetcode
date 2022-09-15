package homework;

public class EX3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr, 0, 4));

    }

    public static int sum(int[] arr, int a, int b) {

        int result = arr[a];
        if (a == b) {
            return arr[b];
        }

        return result += sum(arr, a + 1, b);
    }
}
