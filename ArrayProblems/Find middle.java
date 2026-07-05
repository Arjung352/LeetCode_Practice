class UniqueMiddle {
    public boolean isMiddleElementUnique(int[] nums) {
        //here what we can do is retrive the mid value and use two pointers and compare consiqutively with middle element
        if(nums.length==1){
            return true;
        }
        int mid=nums[nums.length/2];
        int left=0;
        int right=nums.length-1;
        // while loop comparing 2 elements each time
        while(left<right){
            if(nums[left]==mid||nums[right]==mid){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}