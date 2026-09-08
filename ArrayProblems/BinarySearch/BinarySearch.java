package ArrayProblems.BinarySearch;

public class BinarySearch {
        public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return ans;
    }
public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch.search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}
