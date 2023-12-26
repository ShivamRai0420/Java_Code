import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]){
        int n=111;
        int sum=0;
        int count=0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem* (int)Math.pow(2,count));
            n=n/10;
            count++;
        }
        System.out.println(sum);
    }
}
