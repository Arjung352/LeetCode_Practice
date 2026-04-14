import java.util.ArrayList;

public class RepeatandMissingNumberArray {

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 5, 3};
        int n = arr.length;

        // frequency array to count occurrences
        int[] freq = new int[n + 1]; 
        int repeating = -1;
        int missing = -1;

        // count frequency of each element
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // identify missing and repeating numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) missing = i;
            else if (freq[i] == 2) repeating = i;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        System.out.println("Repeating number: " + repeating);
        System.out.println("Missing number: " + missing);
    }
}