import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

public class _268 {
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
           map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i = 0 ; i <= nums.length;i++){
            if(map.get(i) == null){
                return i;
            }
        }
        return -1 ;
    }


}
