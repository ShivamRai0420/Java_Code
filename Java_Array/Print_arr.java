import java.util.*;
class Print_arr
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Kitne no. chahiye");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //Array input
        System.out.println("Input array elm");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Print array elm
        System.out.println("Print array elm");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        } 

        //Sum of array elm
        System.out.println("Sum of array elm");
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        } 
        3System.out.println(sum);


    }
}