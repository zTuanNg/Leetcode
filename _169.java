import java.util.HashMap;
import java.util.Map;

public class _169 {
    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i) > nums.length/2){
                return i;
            }
        }

        return -1;
    }
}
