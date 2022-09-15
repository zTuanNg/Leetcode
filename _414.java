import java.util.*;

public class _414 {
    public static void main(String[] args) {

        int[] nums = {-7,2,2,-4,3,1};
        System.out.println(thirdMax(nums));

    }

    public static int thirdMax(int[] nums) {

        Set<Integer> set = new TreeSet<>();
        for(int i : nums){
            set.add(i);
        }

        System.out.println(set);

        if(set.size() < 3){

            return (int) set.toArray()[set.size()-1];

        }
        return (int) set.toArray()[set.size()-3];
    }
}
