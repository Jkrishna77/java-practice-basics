package section_2_arrays;

/*
 Section 2 - Arrays
 Question 16: Find Missing Number in Array

 Problem:
 Given an array containing n distinct numbers taken from 1 to n+1,
 find the one that is missing.

 Example:
   Input: arr = [1, 2, 4, 5, 6]
   Output: 3
   (Because 3 is missing)

 Approaches:
 1. Sum formula (efficient).
*/

import java.util.*;

public class q13MissingNumber {

    // Approach 1: Sum formula
    public static int findMissingSum(int[] arr) {
        int n = arr.length + 1; // total numbers should be n+1
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (n-1, since one number missing): ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements (from 1 to " + (size + 1) + "):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing number (Sum formula): " + findMissingSum(arr));
        sc.close();
    }
}
