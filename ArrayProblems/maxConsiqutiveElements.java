public class maxConsiqutiveElements {
    public int findMaxConsecutiveOnes(int[] arr) {
        // simple and as expected approach
        int maxAppear=0;
        int currAppear=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                currAppear++;
            }else{
            maxAppear=Math.max(maxAppear,currAppear);
            currAppear=0;
            }
        }
        return Math.max(maxAppear, currAppear);
    }
    public static void main(String[] args) {
        maxConsiqutiveElements obj = new maxConsiqutiveElements();
        int[] arr = {1, 1, 0, 1, 1, 1};
        int result = obj.findMaxConsecutiveOnes(arr);
        System.out.println("Maximum consecutive ones: " + result);
    }
}
