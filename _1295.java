public class _1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {

        int cnt = 0;
        for(int i : nums){
            if (countLenght(i) % 2 == 0){
                cnt += 1;
            }
        }
        return cnt;
    }

    public static int countLenght(int a){
        return String.valueOf(a).length();
    }

}
