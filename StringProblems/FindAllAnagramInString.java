package StringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramInString {
    public List<Integer> findAnagrams(String s, String p) {
        // using sliding window 
        int left=0;
        int right=0;
        List<Integer> result=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        // create and map the p
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // count to keep a track of unique characters
        int count = map.size();

        // now slide the window and check for any right match
        while(right<s.length()){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);

                // if map character gets 0
                if(map.get(ch)==0){
                    count--;
                }
            }
            right++;
            // now moving right pointer if the count became 0
            while(count==0){
                char tempChar=s.charAt(left);
                if(map.containsKey(tempChar)){
                    map.put(tempChar,map.get(tempChar)+1);
                    // if the removed character is in the map then we're going to increase the counter
                    if(map.get(tempChar)>0){
                        count++;
                    }
                }
                // check if the window size is equal to the anagram string
                if(right-left==p.length()){
                    result.add(left);
                }
                left++;
            }  
        }
        return result;
    }
}

