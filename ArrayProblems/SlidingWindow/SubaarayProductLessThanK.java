package SlidingWindow;

class SubaarayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // using sliding window
        if (k<=1) return 0;
        int right=0;
        int left=0;
        int result=0;
        int windowPro=1;
        while(right<nums.length){
            //Expand the window
            windowPro*=nums[right];

            //Shrink the window until product becomes<k
            while(windowPro>=k){
            windowPro/=nums[left];
            left++;
            }
            // Count all valid subarrays
            result += (right - left + 1);
            right++;
        }
        return result;
    }
    public static void main(String[] args) {
        SubaarayProductLessThanK subarrayProduct = new SubaarayProductLessThanK();
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        System.out.println(subarrayProduct.numSubarrayProductLessThanK(nums, k));
    }
}