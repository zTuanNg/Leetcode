public class _896 {
    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] nums) {

        return isDesc(nums) || isInc(nums);

    }

    public static boolean isInc(int[] nums) {

        int num = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < num){
                return false;
            }
            num = nums[i];
        }
        return true;

    }
    public static boolean isDesc(int[] nums) {

        int num = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > num){
                return false;
            }
            num = nums[i];
        }
        return true;

    }
}
