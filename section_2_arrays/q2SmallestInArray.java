package section_2_arrays;
/*
 Section 2 - Arrays
 Question 2: Find the Smallest Element in an Array

 Problem:
 Write a program to find the smallest element in an array.
 Example:
   Input: [4, 1, 7, 3, 9]
   Output: 1

 Multiple Approaches:
 1. Linear traversal: compare each element, keep track of min.
 2. Using Java 8 streams.
*/

import java.util.Scanner;
import java.util.Arrays;

public class q2SmallestInArray {

    // Approach 1: Manual traversal
    public static int findSmallestManual(int[] arr) {
        int min = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    // Approach 2: Using Java 8 streams
    public static int findSmallestStream(int[] arr) {
        return Arrays.stream(arr).min().orElseThrow();
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

        int min1 = findSmallestManual(arr);
        System.out.println("Smallest element (manual): " + min1);

        int min2 = findSmallestStream(arr);
        System.out.println("Smallest element (stream): " + min2);

        sc.close();
    }
}
