public class CheckPalindromeString {
    public static void checkPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                // return false;
                System.out.println("Not ");
            }   
        }
        // return true;
        System.out.println("Palindrome");

    }
    public static void main(String args[]){
        String str="madam";
        checkPalindrome(str);
    }
}
