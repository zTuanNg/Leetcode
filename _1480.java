import java.util.Arrays;

public class _1480 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
       int[] rs = new int[nums.length];
       int i = 0;

       while(i < nums.length){
           for(int j = 0 ; j <= i ; j++){
               rs[i] += nums[j];
           }
           i++;
       }
       return rs;
    }


}
