package section_2_arrays;

/*
 Section 2 - Arrays
 Question 18: Merge Two Sorted Arrays

 Problem:
 Given two sorted arrays, merge them into a single sorted array.

 Example:
   Input: arr1 = [1, 3, 5], arr2 = [2, 4, 6]
   Output: [1, 2, 3, 4, 5, 6]

 Approaches:
 1. Two-pointer technique (efficient, O(n+m)).
 2. Using Streams and sorting.
*/

import java.util.*;
import java.util.stream.*;

public class q15MergeSortedArrays {

    // Approach 1: Two-pointer technique
    public static int[] mergeTwoPointer(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }

    // Approach 2: Using Streams
    public static int[] mergeStream(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                        .sorted()
                        .toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first sorted array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second sorted array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Merged (Two-pointer): " + Arrays.toString(mergeTwoPointer(arr1, arr2)));
        System.out.println("Merged (Stream): " + Arrays.toString(mergeStream(arr1, arr2)));

        sc.close();
    }
}
