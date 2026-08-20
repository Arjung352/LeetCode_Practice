
class RunningSumOfOneDArray {
    public int[] runningSum(int[] nums) {
        // it's a basic prefix sum problem 
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];
        }
        return ans;
    }
}