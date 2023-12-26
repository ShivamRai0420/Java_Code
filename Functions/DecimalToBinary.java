import java.util.*;
public class DecimalToBinary {
    public static void main(String args[]){
        int n=15;
        while(n>0){
            int rem=n%2;
            System.out.print(rem);
            n=n/2;
        }
    }
}

