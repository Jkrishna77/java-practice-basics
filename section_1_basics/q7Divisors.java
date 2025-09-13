package section_1_basics;

/*
 Question 7: Print all Divisors of a Number

 Problem:
 Write a Java program to print all divisors of a given integer.

 Example:
 Input: 12
 Output: 1 2 3 4 6 12

 Multiple Approaches:
 1. Simple loop from 1 to n.
*/

import java.util.Scanner;

public class q7Divisors {

    // Approach 1: Simple loop
    public static void printDivisorsSimple(int n) {
        System.out.print("Divisors (simple loop): ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call both approaches
        printDivisorsSimple(num);

        sc.close();
    }
}

