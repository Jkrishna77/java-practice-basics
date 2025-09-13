package section_2_arrays;

/*
 Section 2 - Arrays
 Question 6: Reverse an Array

 Problem:
 Write a program to reverse the elements of an array.
 Example:
   Input: [1, 2, 3, 4, 5]
   Output: [5, 4, 3, 2, 1]

 Multiple Approaches:
 1. In-place swap using two pointers.
 2. Using a new array.
 3. Using Java 8 streams.
*/

import java.util.Arrays;
import java.util.Scanner;

public class q6ReverseArray {

    // Approach 1: In-place swap
    public static void reverseInPlace(int[] arr) {
        int left=0, right=arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    // Approach 2: Using a new array
    public static int[] reverseNewArray(int[] arr) {
        int n = arr.length;
        int[] revarr= new int[n];
        for (int i = 0; i< n; i++){
            revarr[i] = arr[n-i-1];
        }
        return revarr;
    }

    // Approach 3: Using Java 8 streams
    public static int[] reverseStream(int[] arr) {
        return Arrays.stream(arr)
                     .boxed() // Convert int to Integer
                     .sorted((a,b) -> -1) // Sort in descending
                     .mapToInt(Integer::intValue) // Convert back to int
                     .toArray();
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
        int[] arr1 = Arrays.copyOf(arr, n);
        reverseInPlace(arr1);
        System.out.println("Reversed (in-place): " + Arrays.toString(arr1));

        // Approach 2
        int[] arr2 = reverseNewArray(arr);
        System.out.println("Reversed (new array): " + Arrays.toString(arr2));

        // Approach 3
        int[] arr3 = reverseStream(arr);
        System.out.println("Reversed (stream sort): " + Arrays.toString(arr3));

        sc.close();
    }
}
