public class LinearSearch {
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12};
        int key=10;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Found at"+ i);
            }    
        }
        
        //String
        String str[]={"apple","mango","banana"};
        String target="banana";
        for(int i=0;i<str.length;i++){
            if(str[i]==target){
                System.out.println("Found at"+ i);
            }    
        }
    }
    
}
