package section_2_arrays;

/*
 Section 2 - Arrays
 Question 1: Find the Largest Element in an Array

 Problem:
 Write a program to find the largest element in an array.
 Example:
   Input: [3, 7, 2, 9, 5]
   Output: 9

 Multiple Approaches:
 1. Linear traversal: compare each element, keep track of max.
 2. Using built-in library (Arrays.stream() or Collections).
*/

import java.util.Scanner;
import java.util.Arrays;

public class q1LargestInArray {

    // Approach 1: Manual traversal
    public static int findLargestManual(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

    // Approach 2: Using Java 8 streams
    public static int findLargestStream(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow();
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

        int max1 = findLargestManual(arr);
        System.out.println("Largest element (manual): " + max1);

        int max2 = findLargestStream(arr);
        System.out.println("Largest element (stream): " + max2);

        sc.close();
    }
}
