import java.util.HashSet;
import java.util.Set;

public class _202 {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        int sum;
        while (true) {
            sum = sumNumber(n);
            if (sum == 1) {
                return true;
            }
            if (!set.add(sum)) {
                return false;
            }
            n = sum;
        }
    }

    public static int sumNumber(int n) {
        String num = String.valueOf(n);
        int squareSum = 0;
        if (num.length() == 1) {
            return n * n;
        }

        for (int i = 0; i < num.length(); i++) {
            squareSum += Integer.parseInt(String.valueOf(num.charAt(i))) * Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return squareSum;

    }
}
