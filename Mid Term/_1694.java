public class _1694 {
    public static void main(String[] args) {

        String s = "1-23-45 6";
        System.out.println(reformatNumber(s));

    }

    public static String reformatNumber(String number) {

        String rs = "";
        number = number.replace(" ", "");
        number = number.replace("-", "");

        int l = number.length();

        while (l > 4) {
            rs += number.substring(0, 3) + "-";
            number = number.substring(3);
            l -= 3;
        }

        if (l == 4) {
            rs += number.substring(0, 2) + "-" + number.substring(2);
        }
        if (l == 3) {
            rs += number;
        }
        if (l == 2) {
            rs += number;
        }
        return rs;
    }


}
