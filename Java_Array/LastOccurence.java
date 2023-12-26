
public class LastOccurence {
    public static int getLastOccur(int arr[],int l,int key){
        int s=0;
        int e=l-1;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            int midElm=arr[mid];

            if(key==midElm){
                ans=mid;
                // e=mid-1;
                s=mid+1;
            }

            else if(key<midElm){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;

        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,2,4,4,4};
        int l=arr.length;
        int key=4;
        System.out.println(getLastOccur(arr,l,key));
        
    }
}
