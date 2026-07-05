class Solution {
    public int maxDigitRange(int[] nums) {
        // finding local smallest and largest using modulo and from that digit range
    int range=Integer.MIN_VALUE;
    int ans=0;
     for(int i=0;i<nums.length;i++){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int value=nums[i];
        while(value>0){
            int digit=value%10;
            if(digit>largest){
                largest=digit;
            }
            if(digit<smallest){
                smallest=digit;
            }
            value/=10;
        }
        int localRange=largest-smallest;
         if(localRange>range){
             range=localRange;
             ans=nums[i];
         }
         else if(localRange==range){
             ans+=nums[i];
         }
     }
        return ans;
    }
}