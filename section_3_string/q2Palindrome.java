public class q2Palindrome {
    
    //Method 1: Using loop
    public boolean isPalindromeLoop(String str) {
        String rev="";
        for(int i = str.length() - 1; i>=0; i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    // Method 2: Simple reverse check
    public boolean isPalindromeSimple(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    //Method 3: using two-pointer technique
    public boolean isPalindrome2p(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;       
        }
        return true;
    }


    public static void main(String[] args){

        String str="madam";
        q2Palindrome obj = new q2Palindrome();
        System.out.println("Is the string a palindrome? " + obj.isPalindromeLoop(str));
        System.out.println("Is the string a palindrome? " + obj.isPalindromeSimple(str));
        System.out.println("Is the string a palindrome? " + obj.isPalindrome2p(str));

    }
}
