package SlidingWindow;

public class MaximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        // its a basic sliding window question where the window size is equal to k
        double maxAve=Integer.MIN_VALUE;
        double currAve=Integer.MIN_VALUE;
        // so instead of re calculating the whole subarray for each window 
        // we can just calculate a fixed window once and then add and remove elements from it

        // fixed window
        int sum=0; 
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        maxAve=(double)sum/k;

        // for removing and adding elements from the window

        for(int j=k;j<nums.length;j++){
            sum+=nums[j];
            sum-=nums[j-k];
            currAve=(double) sum/k;
            maxAve=Math.max(maxAve,currAve);
        }
        return maxAve;
    }
    public static void main(String[] args) {
        MaximumAverageSubarray maxAve = new MaximumAverageSubarray();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(maxAve.findMaxAverage(nums, k));
    }
}
