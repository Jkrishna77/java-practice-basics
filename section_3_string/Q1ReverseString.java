
// Q1. Reverse a string without using built-in reverse functions.

public class Q1ReverseString {
    
    // Method 1: Using loop
    public String reverseStringLoop(String str) {
        String rev = "";
        for(int i = str.length() - 1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    // Method 2: Using char array
    public String reverseStringCharArray(String str) {
        char[] arr = str.toCharArray();
        int i=0, j= arr.length -1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    
    //method3: Using Recursion
    public String reverseStringRecursion(String str) {
        if(str.isEmpty()) {
            return str;
        }

        return reverseStringRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){

        Q1ReverseString obj = new Q1ReverseString();
        String str = "Hello, World!";

        System.out.println("Reversed String (Using Loop): " + obj.reverseStringLoop(str));
        System.out.println("Reversed String (Using Char Array): " + obj.reverseStringCharArray(str));
        System.out.println("Reversed String (Using Recursion): " + obj.reverseStringRecursion(str));
    }
}