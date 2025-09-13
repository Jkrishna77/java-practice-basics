package section_2_arrays;

/*
 Section 2 - Arrays
 Question 12: Merge Two Arrays

 Problem:
 Write a program to merge two arrays into a single array.

 Example:
   Input:
     arr1 = [1, 3, 5]
     arr2 = [2, 4, 6]
   Output: [1, 3, 5, 2, 4, 6]

 Multiple Approaches:
 1. Manual copy using loops.
 2. Using Java 8 streams.
*/

import java.util.*;
import java.util.stream.IntStream;

public class q12MergeArrays {

    // Approach 1: Manual loop copy
    public static int[] mergeManual(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i< arr1.length; i++){
            merged[i] = arr1[i];
        }
        for (int j = 0; j< arr2.length; j++){
            merged[arr1.length + j] = arr2[j];
        }
        return merged;    
    }

    // Approach 2: Streams
    public static int[] mergeStream(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                        .toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Merged (Manual): " + Arrays.toString(mergeManual(arr1, arr2)));
        System.out.println("Merged (Stream): " + Arrays.toString(mergeStream(arr1, arr2)));

        sc.close();
    }
}
