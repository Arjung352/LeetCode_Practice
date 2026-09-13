class FindPeakElement {
    public int findPeakElement(int[] nums) {
        // using binary seach because the question says to find the solution in log(N) and here we don't have to find the global max instead we have to find the local max
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left+(right-left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;        
    }
    public static void main(String[] args) {
        FindPeakElement obj = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.findPeakElement(nums)); // Output: 2
    }
}