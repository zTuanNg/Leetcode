public class _520 {
    public static void main(String[] args) {

    }

    public boolean detectCapitalUse(String word) {
        char c = word.charAt(0);
        String s = word.substring(1);
        if (Character.isUpperCase(c)) {
            return (s.equals(word.substring(1).toLowerCase())
                    || s.equals(word.substring(1).toUpperCase()));
        } else {
            return (s.equals(word.substring(1).toLowerCase()));
        }

    }
}

