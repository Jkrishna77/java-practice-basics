package section_2_arrays;

/*
 Section 2 - Arrays
 Question 7: Sum of Even and Odd Elements in an Array

 Problem:
 Write a program to calculate the sum of even numbers and the sum of odd numbers separately in an array.

 Example:
   Input: [1, 2, 3, 4, 5, 6]
   Output:
     Sum of even numbers = 12
     Sum of odd numbers  = 9

 Multiple Approaches:
 1. Using a simple loop.
 2. Using Java 8 streams.
*/

import java.util.Arrays;
import java.util.Scanner;

public class q7SumEvenOddArray {

    // Approach 1: Manual loop
    public static int[] sumEvenOddLoop(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr){
            if(num % 2==0){
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        return new int[]{evenSum,oddSum};
    }

    // Approach 2: Using Java 8 streams
    public static int[] sumEvenOddStream(int[] arr) {
        int evenSum = Arrays.stream(arr)
                            .filter(x -> x%2 ==0)
                            .sum();
        int oddSum= Arrays.stream(arr)
                          .filter(x -> x % 2 != 0)
                            .sum();
        return new int[] {evenSum, oddSum};
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
        int[] result1 = sumEvenOddLoop(arr);
        System.out.println("Even sum (loop): " + result1[0]);
        System.out.println("Odd sum (loop): " + result1[1]);

        // Approach 2
        int[] result2 = sumEvenOddStream(arr);
        System.out.println("Even sum (stream): " + result2[0]);
        System.out.println("Odd sum (stream): " + result2[1]);

        sc.close();
    }
}
