import java.util.Arrays;

public class _1089_DuplicateZero {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 1, 0, 4};

        int[] newArr = new int[arr.length];
        
        int i = 0;
        int k = 0;

        while (i < arr.length && k < arr.length) {
            if (arr[i] != 0) {
                newArr[k] = arr[i];
            } else {
                if (k < arr.length - 2) {
                    newArr[k] = newArr[k + 1] = 0;
                } else {
                    newArr[k] = 0;
                }
                k++;
            }
            i++;
            k++;
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = newArr[j];
        }
        System.out.println(Arrays.toString(arr));
    }
}
