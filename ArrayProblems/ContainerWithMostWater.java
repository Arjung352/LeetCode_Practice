
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        // setting pointers
        int left=0;
        int right=height.length-1;
        int maxWater=0;
        while(left<right){
            int containerHeight=Math.min(height[left],height[right]);
            int width=right-left;
            int currWater=containerHeight*width;
            maxWater=Math.max(maxWater, currWater);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxWater);
    }    
}