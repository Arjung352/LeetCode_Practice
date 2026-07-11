import java.util.HashMap;
import java.util.Map;

public class MaximumFrequency {
        public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency=0;
        int count=0;
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for (int val : freq.values()) {
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }
        }
        return frequency * count;
    }
    public static void main(String[] args) {
        MaximumFrequency obj = new MaximumFrequency();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int result = obj.maxFrequencyElements(nums);
        System.out.println("Maximum frequency multiplied by count: " + result);
    }
}
