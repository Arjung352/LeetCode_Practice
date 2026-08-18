class FindAlmostMissingInteger {
    public int largestInteger(int[] nums, int k) {
        // using sliding window to find the subarray and hashmap to count occurance of each element per window

        // using frequency array as the only contain 50 unqiue elements

        int windowCount[]=new int[51];


        for(int i=0;i<=nums.length-k;i++){
            // find occurance from each window
            int occur[]=new int[51];

            for(int j=i;j<i+k;j++){
                occur[nums[j]]++;
            }

            // now we can find out the only single occurance from each window
            for (int x = 0; x <= 50; x++) {
                if (occur[x] > 0) {
                    windowCount[x]++;
                }
            }
        }    
        int result = -1;

        for (int x = 0; x <= 50; x++) {
            if (windowCount[x] == 1) {
                result = x;
            }
        }

        return result;
    
    }
}