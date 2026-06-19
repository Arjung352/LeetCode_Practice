import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This solution finds all unique triplets in the array that add up to zero.
// Steps:
// 1. Sort the array so we can use the two-pointer pattern and skip duplicates.
// 2. Iterate each number as the first element of a potential triplet.
// 3. For each first element, use left and right pointers to find pairs whose sum
//    with the current element equals zero.
// 4. Move pointers inward based on whether the current sum is too small or too large.
// 5. Skip duplicate values for the current element and the left pointer to avoid
//    duplicate triplets in the result.
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int sum=0;
        // now we can compare and move the pointers based on thier sum
        for(int i=0;i<arr.length;i++){
            // skip itration if the value of i is > 0 and its value is same as the previous
            if (i > 0 && arr[i] == arr[i-1]) {
                continue;
            }
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                sum=arr[i]+arr[left]+arr[right];
                if(sum>0){
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    res.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    while(arr[left]==arr[left-1]&&left<right){
                        left++;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
