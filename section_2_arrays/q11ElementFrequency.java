package section_2_arrays;

/*
 Section 2 - Arrays
 Question 11: Find Frequency of Each Element in an Array

 Problem:
 Write a program to count the frequency of each element in an array.

 Example:
   Input: [1, 2, 2, 3, 1, 4, 2]
   Output:
     1 -> 2 times
     2 -> 3 times
     3 -> 1 time
     4 -> 1 time

 Multiple Approaches:
 1. Using HashMap.

*/

import java.util.*;

public class q11ElementFrequency {

    // Approach 1: Using HashMap
    public static Map<Integer, Integer> frequencyMap(int[] arr) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);

        
        }
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Approach 1
        System.out.println("Frequencies (HashMap):");
        frequencyMap(arr).forEach((k, v) -> System.out.println(k + " -> " + v + " times"));
        sc.close();
    }
}
