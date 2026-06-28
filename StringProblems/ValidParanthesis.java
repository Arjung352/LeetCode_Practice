package StringProblems;

import java.util.Stack;

public class ValidParanthesis {
        public static boolean isValid(String str) {
        Stack<Character>s=new Stack<>();
        int len=str.length();
        for(int i=0;i<len;i++){
            Character ch=str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(str.charAt(i));
            }else{
                if (s.isEmpty()) {
                    return false;
                }
                char top = s.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return s.isEmpty();   
    }
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(isValid(str));
    }
}
