package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarray {
    public int maximumUniqueSubarray(int[] nums) {
        // using sliding window
    int maxSum=0;
    int left=0;
    int currSum=0;
    Set<Integer> set=new HashSet<>();

    for(int right=0;right<nums.length;right++){
            while (set.contains(nums[right])) {
                currSum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);
            currSum+=nums[right];
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaximumUniqueSubarray maxUniqueSubarray = new MaximumUniqueSubarray();
        int[] nums = {4, 2, 4, 5, 6};
        System.out.println(maxUniqueSubarray.maximumUniqueSubarray(nums));
    }
}
