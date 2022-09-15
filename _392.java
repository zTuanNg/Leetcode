import java.util.Stack;

public class _392 {
    public static void main(String[] args) {

        System.out.println(isSubsequence("abc", "ahbgdc"));

    }

    public static boolean isSubsequence(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            stack.push(t.charAt(i));
        }
        int j = s.length() - 1;
        while (!stack.isEmpty() && j >= 0) {
            char c = stack.pop();
            if (String.valueOf(c).equals(String.valueOf(s.charAt(j)))) {
                j--;
            }
        }
        return j == -1;

    }

}
