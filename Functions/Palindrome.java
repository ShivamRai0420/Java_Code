package Functions;
public class Palindrome {
    public static void checkPalindrome(int n)
    {
        int rev=0;
        int copy=n;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(copy==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println(" Not Palindrome");
        }
    }
    public static void main(String args[])
    {
        checkPalindrome(123);
    }
}
