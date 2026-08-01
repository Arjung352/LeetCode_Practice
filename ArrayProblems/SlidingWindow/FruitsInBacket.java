package SlidingWindow;
import java.util.HashMap;
import java.util.Map;
public class FruitsInBacket{
        public int totalFruit(int[] arr) {
        // here we can pick only maximum 2 distinct fruits and we have to find the maximum length of subarray with only 2 distinct fruits
        int left = 0;
        int maxWindow = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {

            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            // If more than 2 fruit types shrink from the left
            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }

            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return maxWindow;
    }
    public static void main(String[] args) {
        FruitsInBacket solution = new FruitsInBacket();
        int[] arr = {1, 2, 1, 2, 3};
        System.out.println(solution.totalFruit(arr)); // Output: 4
    }
}