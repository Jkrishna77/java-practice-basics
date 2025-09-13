package section_1_basics;

/*
 Question 2: Find the Largest of Three Numbers

 Problem:
 Write a Java program to find the largest among three numbers.

 Multiple Approaches:
 1. Using if-else statements.
 2. Using ternary operator (? :).
 3. Using Math.max() function.
*/

import java.util.Scanner;

public class q2LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        // Approach 1: Using if-else statements
        if(a>=b && a>=c){
            System.out.println(a + " is the largest (using if-else)");
        }else if (b>=a && b>=c){
            System.out.println(b + " is the largest (using if-else)");
        }else{
            System.out.println(c + " is the largest (using if-else)");
        }

        // Approach 2: Using ternary operator

        int largest = (a >= b) ? ( (a >= c) ? a : c ) : ( (b >= c) ? b : c );
        System.out.println("Largest Num using ternary: " + largest);

        // Approach 3: Using Math.max()
        int largest1= Math.max(a, Math.max(b, c));
        System.out.println("Largest Num using Math.max(): " + largest1); 
    
        sc.close();
    }
            
}

