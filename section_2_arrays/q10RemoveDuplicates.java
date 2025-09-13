package section_2_arrays;

/*
 Section 2 - Arrays
 Question 10: Remove Duplicates from Array

 Problem:
 Write a program to remove duplicate elements from an array.

 Example:
   Input: [1, 2, 3, 2, 4, 1, 5]
   Output: [1, 2, 3, 4, 5]

 Multiple Approaches:
 1. Using LinkedHashSet (preserves order).
 2. Using Java 8 streams with distinct().
*/

import java.util.*;

public class q10RemoveDuplicates {

    // Approach 1: Using LinkedHashSet
    public static int[] removeDuplicatesSet(int[] arr) {
        Set<Integer> obj=new LinkedHashSet<>();
        for(int num : arr){
            obj.add(num);
        }
        return obj.stream().mapToInt(Integer::intValue).toArray();
    }

    // Approach 2: Using Streams
    public static int[] removeDuplicatesStream(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
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

        System.out.println("After removing duplicates (Set): " + Arrays.toString(removeDuplicatesSet(arr)));
        System.out.println("After removing duplicates (Stream): " + Arrays.toString(removeDuplicatesStream(arr)));

        sc.close();
    }
}
