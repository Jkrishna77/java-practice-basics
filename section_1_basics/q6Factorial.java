package section_1_basics;
/*
 Question 6: Find Factorial of a Number

 Problem:
 Write a Java program to calculate the factorial of a number.

 Factorial definition:
 n! = n × (n-1) × (n-2) × ... × 1
 Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

 Multiple Approaches:
 1. Iterative (loop).
 2. Recursive function.
*/

import java.util.Scanner;

public class q6Factorial {

    // Approach 1: Iterative factorial
    public static long factorialIterative(int n) {
        long fact=1;
        for(int i=2;i<n+1;i++){
            fact *= i;
        }
        return fact;
    }

    // Approach 2: Recursive factorial
    public static long factorialRecursive(int n) {
       if(n==0 || n==1){
          return 1;
       }
       return n* factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Iterative
        long factIter = factorialIterative(num);
        System.out.println("Factorial (iterative): " + factIter);

        // Recursive
        long factRec = factorialRecursive(num);
        System.out.println("Factorial (recursive): " + factRec);

        sc.close();
    }
}
