package homework;

public class _1945 {
    public static void main(String[] args) {

        String s = "iiii";
        System.out.println(getLucky(s, 2));
    }

    public static String convertString(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            int value = (int) c - 96;
            str.append(value);
        }
        return str.toString();
    }

    public static int getLucky(String s, int k) {
        String str = convertString(s);
        int sum = 0;
        while (k != 0) {
            sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            str = String.valueOf(sum);
            k--;
        }
        return sum;
    }
}
