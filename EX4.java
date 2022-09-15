package homework;

public class EX4 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        printArray2D(arr, 0, 0);
    }

    public static void printArray2D(int[][] a, int r, int c) {
        if (r < a.length) {
            if (c < a[r].length) {
                System.out.print(a[r][c] + " ");
                printArray2D(a, r, ++c);
                return;
            }
            System.out.println();
            printArray2D(a, ++r, c = 0);
        }
    }
}
