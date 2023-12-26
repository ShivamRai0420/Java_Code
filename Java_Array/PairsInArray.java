public class PairsInArray {
    public static void pairs(int arr[],int l){
        for(int i=0;i<l;i++){
            int curr=arr[i];
            for(int j=i+1;j<l;j++){
                System.out.print("("+curr+ ","+arr[j]+ ")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int l=arr.length;
        pairs(arr,l);
    }
}
