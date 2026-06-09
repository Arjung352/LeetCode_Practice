
public class RotateArray {
    // this is one of the most optimised approach to rotate an array in O(n) time and O(1) space
        public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    } 

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        // int n=nums.length;
        // k%=n;
        /*
        System.out.println(k + " " + n);
        // better and optimised approach time->O(n) and space O(1)
        // here we firstly reverse the 
        // Reverse the last k elements
        reverse(nums,n-k,n-1);
        // Reverse the remaining n-k elements
        reverse(nums,0,n-k-1);
        // and lastly reversing the whole array
        reverse(nums,0,n-1);
        System.out.println("After rotation:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
 */
// other less optimised approach time->O(n) and space O(n)
        int n=nums.length;
        int temp[]=new int[n];
        int pointer=0;
        k %= n;
        for(int i=n-k;i<n;i++){
            temp[pointer]=nums[i];
            pointer++;
        }
        // now copying the remaining elements
        for(int i=0;i<n-k;i++){
            temp[pointer]=nums[i];
            pointer++;
        }
        // now coying back the elements into the orignal array
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
        System.out.println("After rotation:");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}