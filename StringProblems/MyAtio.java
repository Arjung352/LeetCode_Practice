class Solution {
    public int myAtoi(String s) {
        // here if we encounter any alphabet in s so we'll stop the reading and -,+ only is allowed at the first place else no

        int i = 0;
        int n = s.length();

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If string contains only spaces
        if (i == n) {
            return 0;
        }

        // Check sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        int result = 0;

            while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // if the result is greater than the 32bit integer limit
            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {

                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;

    }
}