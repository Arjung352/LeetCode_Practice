import java.util.ArrayList;
import java.util.Collections;
public class LargestInteger {
    
    // Custom comparator to compare concatenated strings
    public static boolean myCompare(String s1, String s2) {
        return (s1 + s2).compareTo(s2 + s1) > 0;
    }
    public static String largestNumber(int[] nums) {
     // Convert the array of integers to an array of strings
     ArrayList<String> numbers = new ArrayList<>();
     for (int ele : nums) {
         numbers.add(Integer.toString(ele));
        }
        System.out.println("Numbers as strings: " + numbers);
        // Sort the array using the custom comparator
        Collections.sort(numbers, (s1, s2) -> myCompare(s1, s2) ? -1 : 1);
        System.out.println("Sorted numbers: " + numbers);
        // Handle the case where all numbers are zero.
        // We are sorting in descending order, so zero in front means complete array contains zero
        if (numbers.get(0).equals("0")) {
            return "0";
        }
        
        // Concatenate the sorted array
        StringBuilder res = new StringBuilder();
        for (String num : numbers) {
            res.append(num);
        }
        
        return res.toString();
    }
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String result = largestNumber(nums);    
        System.out.println(result); // Output: "9534330"
    }
}