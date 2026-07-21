class Solution {
    public String longestPalindrome(String s) {
        // here what we can do is move center and expand while checking 
        // here we have to make 2 checks one for even length and another for odd length
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0;
        int palSize = 1;
        // Check every character as the center
        for (int center = 0; center < s.length(); center++) {
            
            // Odd length palindrome
            int left = center;
            int right = center;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                int length = right - left + 1;

                if (length > palSize) {
                    palSize = length;
                    start = left;
                }

                left--;
                right++;
            }

            // Even length palindrome
            left = center;
            right = center + 1;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                int length = right - left + 1;

                if (length > palSize) {
                    palSize = length;
                    start = left;
                }

                left--;
                right++;
            }
        }

        return s.substring(start, start + palSize);
    }
}