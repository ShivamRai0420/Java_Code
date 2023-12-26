public class MaxByLinearSearch {
    //Find max elm in array
    public static void getMaxNumber(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Min="+max);
    }

    //Find min elm in array
    public static void getMinNumber(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max="+min);
    }
    public static void main(String args[]){
        int arr[]={1,2,6,3,5};
        getMaxNumber(arr);
        getMinNumber(arr);
    }
}
