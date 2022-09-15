import java.util.Arrays;

public class _1929 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    public static int[] getConcatenation(int[] nums) {

        int[] rs = new int[nums.length * 2];
        int cnt = 0;
        for (int i = 0; i < rs.length; i++) {
            if (cnt > nums.length - 1) {
                cnt = 0;
            }
            rs[i] = nums[cnt];
            cnt++;

        }
        return rs;
    }
}
