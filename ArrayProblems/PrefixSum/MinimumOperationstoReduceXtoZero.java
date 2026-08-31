class MinimumOperationstoReduceXtoZero {
public int minOperations(int[] nums, int x) {
        int total = 0;

        // calculate the prefix sum
        for (int num : nums) {
            total += num;
        }

        // here we only need to find the subarray length equal to the remaining of the subarray
        int target = total - x;

        if (target < 0) {
            return -1;
        }

        // Find longest subarray with sum = target
        int left = 0;
        int sum = 0;
        int maxLen = -1;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        // No subarray found
        if (maxLen == -1) {
            return -1;
        }

        return nums.length - maxLen;
    }
}