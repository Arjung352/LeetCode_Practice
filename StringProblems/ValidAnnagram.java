package StringProblems;

public class ValidAnnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
            // as there are only 26 alphabet
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // use - to convert and manage the ascii values of the characters
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int check : arr) {
            if (check != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnnagram va = new ValidAnnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(ValidAnnagram.isAnagram(s, t));
    }
}
