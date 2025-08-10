class Solution {
    public int longestSubarray(int[] nums) {
        int left =0;
        int n = nums.length;
        int max_length=0;
        int zeros_count =0;

        for(int right=0;right<n;right++){
            if(nums[right] == 0){
                zeros_count++;
                while(zeros_count > 1){
                    if(nums[left] == 0){
                        zeros_count--;
                    }
                    left++;
                }
            }
            max_length = Math.max(max_length,right-left);

        }
        return max_length;
    }
}