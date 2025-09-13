package section_2_arrays;
/*
 Section 2 - Arrays
 Question 3: Find the Second Largest Element in an Array

 Problem:
 Write a program to find the second largest element in an array.
 Example:
   Input: [10, 5, 20, 8, 15]
   Output: 15

 Approach:
 1. Traverse array and keep track of largest and second largest.
*/

import java.util.Scanner;

public class q3SecondLargestInArray {

    // Method to find second largest
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }else if (arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
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

        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);

        sc.close();
    }
}
