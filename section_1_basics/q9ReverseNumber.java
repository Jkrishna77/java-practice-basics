package section_1_basics;
/*
 Question 9: Reverse a Number

 Problem:
 Write a program to reverse a number.
 Example:
   Input: 12345
   Output: 54321

 Multiple Approaches:
 1. Using arithmetic operations (modulus and division).
 2. Converting number to string and reversing with StringBuilder.
*/

import java.util.Scanner;

public class q9ReverseNumber {

    // Approach 1: Arithmetic operations
    public static int reverseNumberArithmetic(int num) {
        int reversed = 0;
        while(num>0){
            int digit = num %10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Approach 2: StringBuilder reverse
    public static int reverseNumberString(int num) {
        String str = String.valueOf(num);
        String reversedStr= new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reversedStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev1 = reverseNumberArithmetic(num);
        System.out.println("Reversed (arithmetic): " + rev1);

        int rev2 = reverseNumberString(num);
        System.out.println("Reversed (string): " + rev2);

        sc.close();
    }
}
