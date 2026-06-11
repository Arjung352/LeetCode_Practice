public class ReplaceElementswithGreatestElementonRightSide {
    public static void main(String[] args) {
        int[] arr={17,18,5,4,6,1};
        // writing more optimised code because last code was taking O(n) space 
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            arr[i]=max;
            max=Math.max(curr,max);
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
