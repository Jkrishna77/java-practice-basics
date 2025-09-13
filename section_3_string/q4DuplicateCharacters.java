

/*
 Section 3 - Strings
 Question 4: Find duplicate characters in a string

 Problem:
 Write a program to find all duplicate characters in a string
 and display them with their counts.

 Example:
   Input: "programming"
   Output: r=2, g=2, m=2

 Approaches:
 1. Use HashMap to count frequency.
*/

import java.util.*;

public class q4DuplicateCharacters {

    // Approach 1: Using HashMap
    public static Map<Character, Integer> findDuplicatesMap(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> duplicateMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            if(freq.get(ch)>1){
                duplicateMap.put(ch, freq.get(ch));
            }

        }
    
        return duplicateMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Duplicates using HashMap: " + findDuplicatesMap(input));

        sc.close();
    }
}
