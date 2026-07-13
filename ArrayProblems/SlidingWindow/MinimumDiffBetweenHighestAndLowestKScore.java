package SlidingWindow;

import java.util.Arrays;

public class MinimumDiffBetweenHighestAndLowestKScore {
    public int minimumDifference(int[] nums, int k) {
        // Best way to implement this is to sort the array and then find minimum based on the window
        if (k == 1){
            return 0;
        } 

        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i]);
        }

        return minDiff;
    }
    public static void main(String[] args) {
        MinimumDiffBetweenHighestAndLowestKScore minDiff = new MinimumDiffBetweenHighestAndLowestKScore();
        int[] nums = {9, 4, 1, 7};
        int k = 2;
        System.out.println(minDiff.minimumDifference(nums, k));
    }
}
