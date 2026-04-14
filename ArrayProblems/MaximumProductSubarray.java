public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        int maxProd = Integer.MIN_VALUE;
        int currMax = 1;

        // Left to right
        for (int i=0;i<nums.length;i++) {
            currMax *= nums[i];
            maxProd = Math.max(maxProd, currMax);
            if (currMax == 0){
                currMax = 1;
            } 
        }

        // Right to left
        currMax = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            currMax *= nums[i];
            maxProd = Math.max(maxProd, currMax);
            if (currMax == 0){
                currMax = 1;
            }
        }
        System.out.println(maxProd);
    }
}
