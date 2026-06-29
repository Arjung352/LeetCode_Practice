class SortColours {
    public static void sortColors(int[] arr) {
        // Using dutch flag algorithem to sort colours
        // The Dutch National Flag (DNF) Algorithm, proposed by Edsger W. Dijkstra, is an efficient 3-way partitioning algorithm. It sorts an array of items categorized into exactly three distinct values (commonly 0s, 1s, and 2s) in a single pass, achieving O(N) time complexity and O(1) space complexity
        // this algo is promotes one pass

        // need 3 pointers 
        // low:- track 0
        // mid:- track 1
        // high:- track 2

        int low=0;
        int mid=0;
        int high=arr.length-1;

        while (mid <= high) {
            // case 1 if the mid is at 0 swap value with low and move both pointer
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;                
            }
            else if(arr[mid]==1){
                // increment mid
                mid++;
            }
            else{
                // last case when mid == 2 so swap with high and decrement high but not mid as we need to check the swaped value
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}