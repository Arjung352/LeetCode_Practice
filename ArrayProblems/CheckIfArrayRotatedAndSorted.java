class Solution {
    public boolean check(int[] nums) {
        // so we can check by comparing the i'th and i+1 element

        // for an array to be sorted and rotated there only can be 1 drop where the condition fails i<i+1 

        int drop=0;
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            // count drops
            if(nums[i]>nums[(i+1) % n]){// to check the last and 1st index as its rotated nature
            drop++;
            }
        }
        return drop<=1;
    }
}