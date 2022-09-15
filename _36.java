import java.util.HashSet;

public class _36 {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {

        return isValid3x3(board) && isValidRow(board) && isValidColumn(board);
    }


    public static boolean isValidRow(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!set.contains(board[i][j])) {
                    if (board[i][j] != '.')
                        set.add(board[i][j]);
                } else
                    return false;
            }
        }

        return true;
    }

    public static boolean isValidColumn(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!set.contains(board[j][i])) {
                    if (board[j][i] != '.')
                        set.add(board[j][i]);
                } else
                    return false;
            }
        }
        return true;
    }


    public static boolean isValid3x3(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int m = i; m < i + 3; m++) {
                    for (int n = j; n < j + 3; n++) {
                        if (!set.contains(board[m][n])) {
                            if (board[m][n] != '.')
                                set.add(board[m][n]);
                        } else
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
