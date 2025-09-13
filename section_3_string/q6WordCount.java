/*
 Section 3 - Strings
 Question 7: Count words in a string

 Problem:
 Write a program to count the number of words in a string.
 (Words are separated by spaces)

 Example:
   Input: "Java is fun"
   Output: 3

 Approaches:
 1. Use split() on whitespace.
*/

import java.util.*;

public class q6WordCount {

    // Approach 1: Using split
    public static int countWordsSplit(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words= str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Word count (split): " + countWordsSplit(input));

        sc.close();
    }
}
