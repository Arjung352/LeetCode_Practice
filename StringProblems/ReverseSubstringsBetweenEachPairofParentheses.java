class Solution {
    public String reverseParentheses(String s) {
        // using stacks to keep a track on paranthesis
        Stack <Integer> stack=new Stack<>();

        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                stack.push(i);
            }
            else if(arr[i]==')'){
                int start=stack.pop();
                reverse(arr,start+1 ,i-1);
            }
        }

        StringBuilder res=new StringBuilder();

        for(char ch:arr){
            if(ch!='('&&ch!=')'){
                res.append(ch);
            }
        }
                return res.toString();
    }
    public void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}