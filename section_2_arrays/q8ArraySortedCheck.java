package section_2_arrays;

/*
 Section 2 - Arrays
 Question 4: Check if Array is Sorted

 Problem:
 Write a program to check if an array is sorted in ascending order.

 Example:
   Input: [1, 2, 3, 4, 5] → Sorted
   Input: [5, 2, 8, 1] → Not sorted

 Multiple Approaches:
 1. Using a simple loop.
 2. Using Java 8 streams.
*/

import java.util.Arrays;
import java.util.Scanner;

public class q8ArraySortedCheck {

    // Approach 1: Loop check
    public static boolean isSortedLoop(int[] arr) {
        for (int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    // Approach 2: Streams
    public static boolean isSortedStream(int[] arr) {
        return Arrays.stream( arr)
                    .sorted()
                    .toArray()
                    .equals(arr);
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

        System.out.println("Is array sorted (loop)? " + isSortedLoop(arr));
        System.out.println("Is array sorted (stream)? " + isSortedStream(arr));

        sc.close();
    }
}
