
public class LastOccur {
    public static int LastOccurence(int arr[],int key,int i){
        //Base case
        if(i==arr.length){
            return -1;
        }
        // if(arr[i]==key){
        //     return i;
        // }
        int isFound=LastOccurence(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int key=5;
        int index=0;
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println("Occur at 1st index= "+LastOccurence(arr,5,index));
    }
}
