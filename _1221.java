package Homework;

public class _1221 {
    public static void main(String[] args) {

        String s = "LLLLRRRR";

        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {

        int cnt = 0;
        int[] arr = new int[2];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R') {
                arr[0] += 1;
            } else {
                arr[1] += 1;
            }
            if (arr[0] == arr[1]) {
                cnt += 1;
                arr[0] = arr[1] = 0;
            }
        }
        return cnt;
    }

}
