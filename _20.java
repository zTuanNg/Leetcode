import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class _20 {
    public static void main(String[] args) {

        String s = "()";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

        Map<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");


        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(String.valueOf(s.charAt(i)))) {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    if (String.valueOf(s.charAt(i)).equals(map.get(st.peek()))) {
                        st.pop();
                    } else {
                        st.push(String.valueOf(s.charAt(i)));
                    }
                }
            }
        }
        return st.isEmpty();
    }


}
