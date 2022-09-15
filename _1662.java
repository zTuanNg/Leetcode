package Homework;

public class _1662 {
    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] wors2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, wors2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String str1 = joinArray(word1);
        String str2 = joinArray(word2);

        return str1.equals(str2);

    }

    public static String joinArray(String[] word) {
        StringBuilder str = new StringBuilder();
        for (String s : word) {
            str.append(s);
        }
        return str.toString();
    }
}
