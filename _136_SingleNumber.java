import java.util.Arrays;

public class _136_SingleNumber {
    public static void main(String[] args) {


    }

    public int singleNumber(int[] nums) {

//        [0,0,1,1,3]
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                i++;
            } else {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
