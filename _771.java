import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;

public class _771 {
    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels,stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {

        Map<Character,Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0 ; i < jewels.length(); i++){
            map.put(jewels.charAt(i),0);
        }

        for(int i = 0 ; i < stones.length(); i++){
            if(map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
            }
        }

        for(Character c : map.keySet()){
//            System.out.println(map.get(c));
            sum += map.get(c);
        }

        return sum;
    }
}
