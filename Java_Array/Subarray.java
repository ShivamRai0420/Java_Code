public class Subarray {
    public static void getArray(int arr[],int l){
        for(int i=0;i<l;i++){
            int start=i;
            for(int j=i;j<l;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
            System.out.print("");
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int l=arr.length;
        getArray(arr,l);
    }
} 
