package section_1_basics;

/*
Question 1: Check if a number is Even or Odd

Problem:
Write a Java program to check if a given integer is even or odd.

Multiple Approaches:
1. Using modulo operator (%).
2. Using bitwise AND operator.
*/


import java.util.Scanner;

public class q1EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        // Approach 1: Using modulo operator
        if(number % 2 == 0){
            System.out.println(number + " is Even (using modulo operator)");
        }else{
            System.out.println(number + " is Odd (using modulo operator)");
        }

        // Approach 2: Using bitwise AND operator
        if((number & 1) ==0){
            System.out.println(number + " is Even (using bitwise AND operator)");
        }else{
            System.out.println(number + " is Odd (using bitwise AND operator)");
        }

        sc.close();
    }

}
