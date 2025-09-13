package section_1_basics;

/*
 Question 8: Check if a Number is an Armstrong Number

 Problem:
 An Armstrong number (narcissistic number) of order 'd' is a number such that:
   sum of its digits^d = the number itself
 Example:
   153 → 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 → Armstrong
   9474 → 9^4 + 4^4 + 7^4 + 4^4 = 9474 → Armstrong

 Multiple Approaches:
 1. Use Math.pow() for exponent calculation.
*/

import java.util.Scanner;

public class q8ArmstrongNumber {

    // Approach 1: Using Math.pow()
    public static boolean isArmstrongMath(int num) {
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits); // digit^digits
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean result1 = isArmstrongMath(num);
        System.out.println("Armstrong check (Math.pow): " + result1);

        sc.close();
    }
}
