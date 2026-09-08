package ArrayProblems.BinarySearch;

public class SearchRotatedSortedArr {
    public static int searchRotatedSortedArr(int arr[],int target,int start,int end) {
    if(start>end){
        return -1;
    }
    int mid =start+(end-start)/2;
    if(arr[mid]==target){
        return mid;
    }
    if(arr[start]<=arr[mid]){
        if(arr[start]<=target&&target<=arr[mid]){
            return searchRotatedSortedArr(arr, target, start, mid);
        }
        else{
            return searchRotatedSortedArr(arr, target, mid+1, end);
        }
    }
    else{
        if(arr[mid]<=target&&target<=arr[end]){
        return searchRotatedSortedArr(arr, target, mid+1, end);
    }
    else{
        return searchRotatedSortedArr(arr, target, start, mid-1);
    }
}
}

    public int search(int[] nums, int target) {
    int result=searchRotatedSortedArr(nums, target, 0, nums.length-1);
    return result;
    }
}
