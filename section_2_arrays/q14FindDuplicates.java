package section_2_arrays;

/*
 Section 2 - Arrays
 Question 17: Find Duplicate Elements in Array

 Problem:
 Given an array of integers, find all duplicate elements.

 Example:
   Input: arr = [4, 3, 2, 7, 8, 2, 3, 1]
   Output: [2, 3]

 Approaches:
 1. Using frequency map.
*/

import java.util.*;

public class q14FindDuplicates {

    // Approach 1: Using frequency map
    public static Set<Integer> findDuplicatesMap(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) == 2) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Duplicates (Map method): " + findDuplicatesMap(arr));

        sc.close();
    }
}
