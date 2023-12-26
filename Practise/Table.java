//W.A.P to Print table of 5.
import java.util.*;
public class Table {
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number");
        int n=obj.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n + " * " + i + " = " +(n*i));
        }
    }
    
}
