package StringProblems;


public class ReplaceConsecutive {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder str=new StringBuilder();
        str.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        ReplaceConsecutive obj = new ReplaceConsecutive();
        String s = "aaabbbccdaa";
        String result = obj.removeDuplicates(s);
        System.out.println("String after removing consecutive duplicates: " + result);
    }
}
