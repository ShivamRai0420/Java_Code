import java.util.*;
public class BinaryFunction {
    //Binary To Decimal
    public static void getBinaryToDecimal(int n){
        int count=0;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+ rem*(int)Math.pow(2,count);
            n=n/10;
            count++;
        }
        System.out.println("Binary To Decimal = "+sum);
    }

    //Decimal To Binary
    public static void getDecimalToBinary(int n){
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
    public static void main(String args[]){
        getBinaryToDecimal(101);
        getDecimalToBinary(5);
    }
}
