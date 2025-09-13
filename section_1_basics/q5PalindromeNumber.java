package section_1_basics;

/*
 Question 5: Check if a Number is a Palindrome

 Problem:
 Write a Java program to check if a given integer is a palindrome.
 A palindrome number reads the same backward as forward.
 Example: 121, 1331, 12321.

 Multiple Approaches:
 1. Reverse the number using arithmetic and compare.
 2. Convert number to string and check with reverse.
*/

import java.util.Scanner;

public class q5PalindromeNumber {

    // Approach 1: Reverse number using arithmetic
    public static boolean isPalindromeArithmetic(int num) {
        int orignal = num;
        int reversed = 0;
        while (num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return reversed == orignal;
    }

    // Approach 2: Convert to String and reverse
    public static boolean isPalindromeString(int num) {
        String str = String.valueOf(num);
        String reveString= new StringBuilder(str).reverse().toString();
        return str.equals(reveString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Arithmetic check
        boolean result1 = isPalindromeArithmetic(num);
        System.out.println("Palindrome check (arithmetic): " + result1);

        // String check
        boolean result2 = isPalindromeString(num);
        System.out.println("Palindrome check (string): " + result2);

        sc.close();
    }
}
