package Functions;
import java.util.*;
public class Add {
    public static void main(String args[]){
        Scanner obj=new Scanner (System.in);        //For taking input (Make obj of Scanner class)

        System.out.println("Enter A number");
        int a=obj.nextInt();

        System.out.println("Enter B number");
        int b=obj.nextInt();

        System.out.print("Sum of A & B = ");
        int sum=a+b;
        System.out.println(sum);

    }
}
