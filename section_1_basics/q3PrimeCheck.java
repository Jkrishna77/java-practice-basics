package section_1_basics;
/*
 Question 3: Check if a number is Prime

 Problem:
 Write a Java program to check if a number is prime.
 A prime number is greater than 1 and has only two divisors: 1 and itself.
*/

import java.util.Scanner;

public class q3PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Approach 1: Basic loop check
        boolean isPrime1 = true;
        if(num <= 1){
            isPrime1 = false;
        }
        for(int i = 2; i<num-1; i++){
            if (num % i ==0){
                isPrime1 = false;
                break;
            }
        }
        System.out.println("Number is Prime?: " + isPrime1);

        // Approach 2: Optimized loop up to sqrt(num)
        boolean isPrime2 = true;
        if (num <= 1) {
            isPrime2 = false;
        }
        for( int i = 2; i * i <= num ; i++){
            if (num % i ==0){
                isPrime2=false;
            }
        }
        System.out.println("Prime check (sqrt optimization): " + isPrime2);

        sc.close();
    }
}
