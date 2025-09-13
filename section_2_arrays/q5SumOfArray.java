package section_2_arrays;

/*
 Section 2 - Arrays
 Question 5: Sum of All Elements in an Array

 Problem:
 Write a program to calculate the sum of all elements in an array.
 Example:
   Input: [3, 7, 2, 9, 5]
   Output: 26

 Multiple Approaches:
 1. Using a simple loop.
 2. Using Java 8 streams.
*/

import java.util.Scanner;
import java.util.Arrays;

public class q5SumOfArray {

    // Approach 1: Manual loop
    public static int sumArrayManual(int[] arr) {
        int sum =0;
        for (int num : arr){
            sum +=num;
        }
        return sum;
    }

    // Approach 2: Java 8 streams
    public static int sumArrayStream(int[] arr) {
        return Arrays.stream(arr).sum();
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

        int sum1 = sumArrayManual(arr);
        System.out.println("Sum of elements (manual): " + sum1);

        int sum2 = sumArrayStream(arr);
        System.out.println("Sum of elements (stream): " + sum2);

        sc.close();
    }
}

