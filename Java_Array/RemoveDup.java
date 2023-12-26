class RemoveDup {
    public static int removeDuplicates(int[] nums) {
        int[] arr = new int[101];
    	int[] arrMin = new int[101];
    	for(int i=0;i<nums.length;i++) {
    		if(nums[i] < 0) {
    			arrMin[nums[i]*(-1)]++;
    		}
			else {
    			arr[nums[i]]++;
    		}
        }
    	int k=0;
    	for(int i=arrMin.length-1;i>0;i--) {
    		if(arrMin[i] > 0) {
    			nums[k++] = (-1) * i;
    		}
        }
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i] > 0) {
    			nums[k++] = i;
    		}
        }
    	return k;
    }
	public static void main(String args[]){
		int arr[]={1,4,7,2,4,1};
		// removeDuplicates(arr);
		int length = removeDuplicates(arr);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}