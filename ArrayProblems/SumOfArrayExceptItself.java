package ArrayProblems;


public class SumOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
                int n = nums.length;
        int[] arr = new int[n];

        int product = 1;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                arr[i] = 0; // more than one zero → all zero
            } else if (zeroCount == 1) {
                // only index with zero gets product rest 0
                arr[i] = (nums[i] == 0) ? product : 0;
            } else {
                arr[i] = product / nums[i]; 
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        SumOfArrayExceptItself solution = new SumOfArrayExceptItself();
        int arr[] = {1, 0, 0, 4};
        int[] result = solution.productExceptSelf(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
}
    }
    