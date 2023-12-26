public class MaxSubArray {
    public static void MaxSubArraySum(int arr[],int l){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            int start=i;
            for(int j=i;j<l;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum=currSum + arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum= "+maxSum);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int l=arr.length;
        MaxSubArraySum(arr,l);
    }

}
