import java.util.*;

public class _791 {
    public static void main(String[] args) {

        String order = "kqep";
        String s = "pekeq";
        System.out.println(customSortString(order,s));

    }

    public static String customSortString(String order, String s) {

        StringBuilder rs = new StringBuilder();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < order.length(); i++) {
            set.add(order.charAt(i));
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            else
                rs.append(s.charAt(i));
        }
        for (int i = 0; i < order.length(); i++) {
            if (map.containsKey(order.charAt(i))) {
                int value = map.get(order.charAt(i));
                while (value > 0) {
                    rs.append(order.charAt(i));
                    value--;
                }
            }
        }
        return rs.toString();

    }


}
