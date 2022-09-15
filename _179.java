import java.util.*;

public class _179 {
    public static void main(String[] args) {

        int[] nums = {3, 30, 34, 5, 9};

        List<String> lst = new ArrayList<>();

        for (int num : nums) {
            lst.add(String.valueOf(num));
        }

        Collections.sort(lst, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o2.compareTo(o1);
                }
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        System.out.println(lst);

    }

    public static String largestNumber(int[] nums) {

        List<String> lst = new ArrayList<>();
        String rs = "";

        for (int num : nums) {
            lst.add(String.valueOf(num));
        }

        Collections.sort(lst, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o2.compareTo(o1);
                }
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (lst.get(0).equals("0")) {
            return "0";
        }
        for (String s : lst) {
            rs += s;
        }
        return rs;
    }
}
