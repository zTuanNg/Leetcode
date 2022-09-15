package Homework;

public class _1816 {
    public static void main(String[] args) {

        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {

        StringBuilder str = new StringBuilder();
        String[] stringArr = s.split(" ");
        for (int i = 0; i < k; i++) {
            str.append(stringArr[i] + " ");
        }
        return str.toString().trim();
    }


}
