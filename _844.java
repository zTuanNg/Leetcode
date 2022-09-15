package homework;

import java.util.Stack;

public class _844 {
    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));


    }

    public static Stack<Character> processString(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        return stack;
    }

    public static boolean backspaceCompare(String s, String t) {
        return processString(s).equals(processString(t));

    }
}
