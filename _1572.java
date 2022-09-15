public class _1572 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));


    }

    public static int diagonalSum(int[][] mat) {

        int sum = 0;
        int l = mat.length;

        if (l == 1) {
            return mat[0][0];
        }

        for (int i = 0, j = l - 1; i < l; i++, j--) {
            sum += mat[i][i];
            if (i != j) {
                sum += mat[i][j];
            }
        }
        return sum;
    }
}
