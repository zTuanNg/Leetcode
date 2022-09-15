package Homework;

import java.util.Arrays;

public class _344 {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {

        int j = s.length - 1;
        for (int i = 0; i < j; i++, j--) {
            char temp;
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
