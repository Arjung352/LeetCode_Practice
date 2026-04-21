import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(map.containsKey(value)){
                System.out.println("Indices: " + map.get(value) + ", " + i);
            }
            map.put(nums[i],i);
        }
        System.out.println("Indices not found");
    }
}
