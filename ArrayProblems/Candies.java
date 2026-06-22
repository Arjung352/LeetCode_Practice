import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        // 2 pass solution
        int n = ratings.length;

        // Array to store the number of candies assigned to each child
        int[] candies = new int[n];

        // Every child must receive at least one candy
        Arrays.fill(candies, 1);

        // Left-to-right pass:
        // If the current child's rating is greater than the previous child's rating give them one more candy than the previous child.
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right-to-left pass:
        // If the current child's rating is greater than the next child's rating, ensure they have more candies than the next child.
        // Math.max() is used so we don't overwrite a larger value assigned during the left-to-right traversal.
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        System.out.println(totalCandies);
    }
}