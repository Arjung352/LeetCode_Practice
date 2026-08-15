package SlidingWindow;
import java.util.HashMap;

class Solution {
    public int maximumLengthSubstring(String s) {
        // using sliding window to move the pointer's and using hashmap to count the occurance

        HashMap <Character,Integer> map = new HashMap<>();
        int maxSize=0;
        int left=0;
        
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(s.charAt(right))>2){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            maxSize = Math.max(maxSize, right - left + 1);        
        }
        return maxSize;
    }
}