class Solution {
    public boolean validPalindrome(String s) {
        // making and maintiaining a variable to keep a track on skips 
        int skip=0;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(skip<2){
                if(s.charAt(left)==s.charAt(right)){
                    left++;
                    right--;
                }
                else{
                    // in one we're going to send left value incremented and in another the right value incremented so that the we can found all the possible senario
                    skip++;
                    boolean resultOne=isPalindrom(left+1,right,s);
                    boolean resultTwo=isPalindrom(left,right-1,s);
                    if(resultOne||resultTwo){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrom(int left,int right,String s){
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}