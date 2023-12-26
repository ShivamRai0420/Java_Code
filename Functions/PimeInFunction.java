import java.util.*;
public class PimeInFunction {
    public static boolean checkprime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else{
            return false;
        }
    } 

    // For print prime b/w 2 t0 20
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(checkprime(i)){
                System.out.println(i+ " ");
            }
            // System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n= ");
        int n=sc.nextInt();
        System.out.println(checkprime(n));
        primeinrange(10);
    }
}
