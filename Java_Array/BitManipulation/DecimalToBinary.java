
import java.util.*;

public class DecimalToBinary {
    public static void main(String args[]){
        int n=4;
        int count=0;
        int sum=0;
        while(n>0){
            int rem=n%2;
            sum=sum+ rem*(int)Math.pow(10,count);      //Or Sysout(rem);
            n=n/2;
            count++;
        }
        System.out.println("Decimal To Binary = "+sum);
    }
}
