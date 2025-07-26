class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n= nums.length;
        int[] result = new int[n-k+1];

        for(int i=0;i<=n-k;i++){
            int max = nums[i];
            boolean isConsecutive_Sorted = true; 
            for(int j=1;j<k;j++){
                if(nums[i+j] != nums[i+j-1] +1){
                    isConsecutive_Sorted = false;
                    break;
                }
                max= Math.max(max,nums[i+j]);
            }

            if(isConsecutive_Sorted){
                result[i] = max;
            }else{
                result[i] = -1;
            }
        }
        return result;
    }
}