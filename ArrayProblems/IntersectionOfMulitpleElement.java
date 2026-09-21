import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMulitpleElement {
    class Solution {
    public List<Integer> intersection(int[][] nums) { 
        List<Integer> ans = new ArrayList<>();
        
        // frequency array
        int[] count  = new int[1001];
        // map the elements in the array
        for(int[] arr : nums){
            for(int i : arr){
                count[i]++;
            }
        }
        // check if the frequency is == to the length
       for(int i=0;i<count.length;i++){
           if(count[i]==nums.length){
               ans.add(i);
           }
       }
        
        return ans;
    }
}
}
