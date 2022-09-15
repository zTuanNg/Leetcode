import java.util.Arrays;

public class _1_TwoSum {

    public static void main(String[] args) {


    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
//        System.out.println(Arrays.toString(result));
        for(int i=0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
