public class RemoveDuplicateElm {
   public static void findDuplicate(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if (arr[i]==arr[j]){
                continue;
            }
            System.out.println("Found Duplicate arr elm= "+ arr[i]);
        }
    }
   }
   public static void RemoveDuplicateString(String str2){
    char arr[]=str2.toCharArray();
    int index=0;
    for(int i=0;i<str2.length();i++){
        int j;
        for( j=i+1;j<str2.length();j++){
            if(arr[i]==arr[j]){
                break;
            }
        }
        if(j==i){
            arr[index++]=arr[i];
        }
    }
    System.out.println("Fond Duplicate String elm= "+ arr[j]+" ");
   }
    public static void main(String args[]){
        int arr[]={1,2,6,2,4,1};
        String str="w3schools";
        String str2="12321";

        findDuplicate(arr);
        // findDuplicateString(str);
        RemoveDuplicateString(str2);

    }
}
