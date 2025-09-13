package section_1_basics;

/*
 Question 4: Generate Fibonacci Series up to n terms

 Problem:
 Write a Java program that generates the Fibonacci series up to n terms.

 Fibonacci sequence:
 F(0) = 0, F(1) = 1
 F(n) = F(n-1) + F(n-2) for n >= 2

 Multiple Approaches:
 1. Iterative loop (efficient).
 2. Recursive function (simple but less efficient).
*/

import java.util.Scanner;

public class q4FibonacciSeries {

    // Approach 1: Iterative
    public static void fibonacciIterative(int n) {
        int a= 0;
        int b = 1;
        System.out.print("Fibonacci (iterative): ");
        for(int i= 0; i<n; i++){
            System.out.print(a+" ");
            int next = a+b;
            a=b;
            b=next;

        }
        System.out.println();
    }

    // Approach 2: Recursive function
    public static int fibonacciRecursive(int n) {
        if (n ==0) return 0;
        if (n==1) return 1;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Call iterative version
        fibonacciIterative(n);

        // Call recursive version
        System.out.print("Fibonacci (recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        sc.close();
    }
}
