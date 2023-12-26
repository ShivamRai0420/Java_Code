import java.util.*;
public class Sorting {
public static void main(String args[]){
    int arr[]={4,8,2,7,8,9};
    int temp;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){

            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    //By sorting function.
    // Arrays.sort(arr);

    // for(int i=0;i<arr.length;i++){

    //     System.out.println(arr[i]);
    // }
}
}
