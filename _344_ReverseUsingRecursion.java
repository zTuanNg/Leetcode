package homework;

public class _344_ReverseUsingRecursion {
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s, s.length - 1);

    }

    public static void reverseString(char[] s, int l) {
        if (l == 0) {
            System.out.println(s[0]);
            return;
        }
        System.out.println(s[l]);
        reverseString(s, l - 1);


    }
}
