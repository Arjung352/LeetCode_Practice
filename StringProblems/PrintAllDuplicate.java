package StringProblems;

import java.util.HashMap;
import java.util.Map;
public class PrintAllDuplicate {
    public static void printDuplicates(String str) {
        // using HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        // counting occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> it : charCountMap.entrySet()) {
            if (it.getValue() > 1) {
                System.out.print("['" + it.getKey() + "', " + it.getValue() + "], ");
            }
        }

    }

    public static void main(String[] args) {
        String str = "arjungupta";
        printDuplicates(str);
    }
}