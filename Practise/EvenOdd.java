// W.A.P to check number is Even or Odd.
// Even- No. which is fully divisible by 2. i.e n%2=0 Ex- 2,4,6...etc 
// Odd- No. which is not divisible by 2. i.e n%2 !=0 Ex- 1,3,5...etc 

import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);

        System.out.println("Enter number");
        int n= obj.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
