/*
 Section 3 - Strings
 Question 3: Count vowels and consonants in a string

 Problem:
 Write a program to count the number of vowels and consonants
 in a given string.

 Example:
   Input: "hello world"
   Output: Vowels = 3, Consonants = 7
*/

import java.util.Scanner;

public class q3VowelConsonantCount {

    // Method 1: Simple and clean
    public static void countVowelsConsonants(String str) {
        str = str.toLowerCase(); // convert to lowercase for uniform checking
        int vowels = 0, consonants = 0;
        String vowelString = "aeiou";
        for (char ch : str.toCharArray()){
            if(vowelString.contains(ch+"")){
                vowels++;
            } else{
                consonants++;
            }
        }

        System.out.println("Vowels = " + vowels + ", Consonants = " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        countVowelsConsonants(input);

        sc.close();
    }
}
