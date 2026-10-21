class Solution {
    public String sortSentence(String s) {
        // break the string on an array of string retrive the last char and make a new string following the qiven order
        String[] str=s.split(" ");
        String[] ans=new String[str.length];
        for (String word : str) {
            int pos = word.charAt(word.length() - 1) - '0';
            ans[pos - 1] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", ans);
    }
}
