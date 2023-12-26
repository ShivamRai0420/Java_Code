
public class FirstOccur {
    public static int firstOccur(int arr[],int key,int i){
        //Base case
        if(i==arr.length){
            return i;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,key,i+1);
    }
    public static void main(String args[]){
        int key=5;
        int index=0;
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println("Occur at 1st index= "+firstOccur(arr,5,index));
    }
}
