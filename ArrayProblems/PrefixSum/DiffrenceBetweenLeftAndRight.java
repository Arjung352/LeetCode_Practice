public class DiffrenceBetweenLeftAndRight {
    public static int[] leftRightDifference(int[] nums) {
        
        int rightSum[] = new int[nums.length];
        int leftSum[]=new int[nums.length];
        int result[]=new int[nums.length];
        
        // calculate left sum
        leftSum[0]=0;
        
        for(int i=1;i<nums.length;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }
        
         // calculate right sum
        rightSum[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
                rightSum[i]=rightSum[i+1]+nums[i+1];
        }
        
        // find absolute diffrence and return in an array
        for(int i=0;i<nums.length;i++){
            result[i]=Math.abs(rightSum[i]-leftSum[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={10,4,8,3};
        int result[]=leftRightDifference(nums);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
