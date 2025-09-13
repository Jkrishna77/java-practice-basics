package section_2_arrays;

/*
 Section 2 - Arrays
 Question 4: Find the Second Smallest Element in an Array

 Problem:
 Write a program to find the second smallest element in an array.
 Example:
   Input: [10, 5, 20, 8, 15]
   Output: 8

 Approach:
 1. Traverse array and keep track of smallest and second smallest elements.
*/

import java.util.Scanner;

public class q4SecondSmallestInArray {

    // Method to find second smallest
    public static int findSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i =0; i< arr.length; i++){
            if(arr[i] < first){
                second = first;
                first=arr[i];
            }else if ( arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        if (second == Integer.MAX_VALUE){
            throw new IllegalArgumentException("No second smallest element found (all elements might be equal)");
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

        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Second smallest element: " + secondSmallest);

        sc.close();
    }
}
