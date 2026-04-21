import java.util.HashMap;
import java.util.Map;

public class minimumAbsoluteDistanceBetweenMirrorPair {

        public static int reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    } 
    public static int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int minDistance=Integer.MAX_VALUE;
        if(nums.length==1){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                minDistance=Math.min(minDistance,i-map.get(nums[i]));
            }
            int rev=reverse(nums[i]);
            map.put(rev,i);
        }
        return minDistance==Integer.MAX_VALUE?-1:minDistance;
}
    public static void main(String[] args) {
        int[] nums={12,21,13,31,14};
        System.out.println(minMirrorPairDistance(nums));        
    }
}