public class SumOddLengthSubarrays {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int windowSize = 1;
        int totalSum = 0;

        while (windowSize <= arr.length) {

            // Calculate the first window sum
            int windowSum = 0;
            for (int i = 0; i < windowSize; i++) {
                windowSum += arr[i];
            }
            totalSum += windowSum;

            // Slide the window
            for (int i = windowSize; i < arr.length; i++) {
                windowSum += arr[i];
                windowSum -= arr[i - windowSize];
                totalSum += windowSum;
            }

            // Move to the next odd window size
            windowSize += 2;
        }
        System.out.println(totalSum);
    }
}
