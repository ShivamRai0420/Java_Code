import java.util.*;
public class Creation {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        //Creation
        int arr[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=obj.nextInt();
            }
        }

        //Initialise and Print
        // int arr[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
