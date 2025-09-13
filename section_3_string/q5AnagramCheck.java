/*
 Section 3 - Strings
 Question 5: Check if two strings are anagrams

 Problem:
 Write a program to check whether two strings are anagrams.
 (Anagram: one string can be rearranged to form another)

 Example:
   Input: "listen", "silent"
   Output: true

 Approaches:
 1. Sort both strings and compare.
*/

import java.util.*;

public class q5AnagramCheck {

    // Approach 1: Sort and compare
    public static boolean isAnagramSort(String s1, String s2) {
        if(s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        System.out.println("Anagram (Sort method): " + isAnagramSort(str1, str2));

        sc.close();
    }
}
