import java.util.ArrayList;
import java.util.List;

public class _412 {
    public static void main(String[] args) {

    }

    public static List<String> fizzBuzz(int n) {

        List<String> rs = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                rs.add("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                rs.add("Buzz");
            } else if (i % 15 == 0) {
                rs.add("FizzBuzz");
            } else {
                rs.add(String.valueOf(i));
            }
        }

        return rs;
    }
}
