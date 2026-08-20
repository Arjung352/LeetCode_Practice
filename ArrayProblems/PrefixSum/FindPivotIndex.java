public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {
        // using prefix sum to find the pivot index
        // calculating the leftPrefix Sum
        int leftPrefix[]=new int[nums.length];
        leftPrefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            leftPrefix[i]=leftPrefix[i-1]+nums[i];
        }
        // calculating the leftPrefix Sum
        int rightPrefix[]=new int[nums.length];
        rightPrefix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightPrefix[i]=rightPrefix[i+1]+nums[i];
        }
        System.out.println("Left Prefix sum");
        for(int num:leftPrefix){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Right Prefix sum");
        for(int num:rightPrefix){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){
            if(leftPrefix[i]==rightPrefix[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPivotIndex obj=new FindPivotIndex();
        int nums[]={2,1,-1};
        System.out.println("Pivot Index --> "+pivotIndex(nums));
    }    
}
