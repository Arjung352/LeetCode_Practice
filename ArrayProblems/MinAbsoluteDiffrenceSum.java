public class MinAbsoluteDiffrenceSum {
    public static int minAbsoluteDifference(int[] nums) {
        // here what we can do is initialze 2 variables 1st one to track one and another one to track 2 
        int one=-1;
        int two=-1;
        int diff=Integer.MAX_VALUE;
        // then we can simply itrate through the array and find abs differance
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1||nums[i]==2){
                if(nums[i]==1){
                    one=i;
                }
                else{
                    two=i;
                }
            }
            // find abs diffrence they both hold actual indices
            if(one>-1&&two>-1){
                diff=Math.min(diff,Math.abs(one-two));
            }
        }
        if(diff==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return diff;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(minAbsoluteDifference(nums));
    }

}
