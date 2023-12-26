public class BinarySearch 
{
    public static int binarysearch(int arr[],int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                return mid;
            } 
            if(arr[mid]<target)         //left part
            {
                s=mid+1;
            }
            else{                       //right part
                e=mid-1;
            } 
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        int target=8;
        System.out.println("index at"+binarysearch(arr,target));
        
    } 
}       
