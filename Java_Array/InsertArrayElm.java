import java.util.*;
public class InsertArrayElm {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Kitne array elm chahiye");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int arr2[]=new int[n+1];
        //Array Input
        System.out.println("Enter array elm");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        //Print array elm
        System.out.println("Print array elm");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Konsa elm insert krna h ");
        int insert=sc.nextInt();

        System.out.println("Konse index pr elm insert krna h ");
        int index=sc.nextInt();

        //putting aar elm into arr2 till index.
        for (int i = 0; i < index - 1; i++) {
            arr2[i] = arr[i];
        }

        arr2[index-1]=insert;
        for (int i = index - 1; i < n; i++) {
            arr2[i + 1] = arr[i];
        }

        System.out.println("Print after insert array elm");
        for(int i=0;i<n+1;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
