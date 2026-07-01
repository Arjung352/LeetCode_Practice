public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        // so we're required to return the number of non repeating elements in an array
        int count=1;
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        int[] arr = {1,1,2,2,3,4,4,5};
        int count = obj.removeDuplicates(arr);
        System.out.println("Number of non-repeating elements: " + count);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}