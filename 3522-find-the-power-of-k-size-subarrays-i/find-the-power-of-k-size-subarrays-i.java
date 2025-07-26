class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];

        for(int i=0;i<=n-k;i++){
            int[] subarray = new int[k];
            for(int j=0;j<k;j++){
                subarray[j] = nums[i+j];
            }

            boolean isConsecutive_Sorted = true;
            for(int j=1;j<k;j++){
                if(subarray[j] != subarray[j-1] + 1){
                    isConsecutive_Sorted = false;
                    break;
                }
            }

            if(isConsecutive_Sorted){
                result[i] = subarray[k-1]; 
            }else{
                result[i] = -1;
            }
        }
        return result;
    }
}

