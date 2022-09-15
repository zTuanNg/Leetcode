import java.lang.invoke.VarHandle;

public class _14 {
    public static void main(String[] args) {

        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));

    }

    public static String longestCommonPrefix(String[] strs) {

        String rs = "";

        int l = Integer.MAX_VALUE;

        for (String word : strs) {
            if (word.length() < l) {
                l = word.length();
            }
        }

        for (int i = 0; i < l; i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return rs;
                }
            }
            rs += c;
        }


        return rs;
    }
}
