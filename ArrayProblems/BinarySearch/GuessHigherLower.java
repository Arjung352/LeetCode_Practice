package ArrayProblems.BinarySearch;

public class GuessHigherLower {
    public class Solution {
        // The guess API is defined in the parent class VersionControl.
        // @param num, your guess
        // @return -1 if num is higher than the guess number
        //          1 if num is lower than the guess number
        //          otherwise return 0
        int guess(int num) {
            return 0;
        }
    public int guessNumber(int n) {
             int left = 1;
             int right = n;
             
             while (left<=right){
             int mid = left + (right-left)/2;

            //  call the guess api and guess and check the resultant number
             int result = guess(mid);

             if (result == 0){
             return mid;
             }

             else if (result == -1){
                right = mid - 1;
             }
             else {
                left = mid + 1;
             }
        }
    return -1;
    }
}
}
