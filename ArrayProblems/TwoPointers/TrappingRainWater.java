public class TrappingRainWater {
    public int trap(int[] height) {
        int length=height.length;
        // calculating left max boundry
        int leftMax[]=new int[length];
        leftMax[0]=height[0];
        for(int i=1;i<length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        // calculating right max boundry
        int rightMax[]=new int[length];
        rightMax[length-1]=height[length-1];
        for(int i=length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
    int trappedWater=0;
    for(int i=0;i<length;i++){
        int waterLevel=Math.min(rightMax[i], leftMax[i]);
        trappedWater+=waterLevel-height[i];
    }
    return trappedWater;
    }
}
