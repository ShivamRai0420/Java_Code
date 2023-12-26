// W.A.P to check number is Prime or not.

// Prime no.-Only divisible by 1 or itself. Ex.= 2,3,5,7,11,13,17...(only 2 is smallest evn prime no.)
import java.util.*;
public class PrimeCheck 
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number");
        int n=obj.nextInt();
        
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(" Prime no.");
        }
        else
        {
            System.out.println(" Not Prime");
        }
    }   
}
