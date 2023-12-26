public class MaxMin {
    public static void Maxm(int arr[],int l){
        // int max=arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            // max=Math.min(max,arr[i]);
        }
        System.out.println("max = "+max);
    }
    public static void Minm(int arr[],int l){
        // int minm=arr[0];
        int minm=Integer.MAX_VALUE;
        for(int i=0;i<l;i++){
            if(arr[i]<minm){
                minm=arr[i];
            }
        // minm=Math.min(minm,arr[i]);
        }
        System.out.println("minm= "+minm);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,1,10};
        int l=arr.length;
        Maxm(arr,l);
        Minm(arr,l);
    }
}
