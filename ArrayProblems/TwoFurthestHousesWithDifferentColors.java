public class TwoFurthestHousesWithDifferentColors {

    public static void main(String[] args) {
        int[] colors = {1, 1, 1, 6, 1, 1, 1};
        int left = 0;
        int right = colors.length - 1;
        int maxDist = 0;

        // move right pointer
        while (left < right) {
            if (colors[left] != colors[right]) {
                maxDist = right - left;
                break;                  
            } else {
                right--;
            }
        }

        left = 0;
        right = colors.length - 1;

        // move left pointer
        while (left < right) {
            if (colors[left] != colors[right]) {
                maxDist = Math.max(maxDist, right - left); 
                break;                                    
            } else {
                left++;
            }
        }
        System.out.println(maxDist);
    }
}