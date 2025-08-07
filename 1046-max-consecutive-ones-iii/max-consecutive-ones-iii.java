class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0, right=0, zero_count=0, max_length=0, n=nums.length;

        while(right<n){
            if(nums[right] == 0){
                zero_count++;
            }

            while(zero_count > k){
                if(nums[left] == 0){
                    zero_count--;
                }
                left++;
            }
            max_length = Math.max(max_length,right-left+1);
            right++;
        }
        return max_length; 
    }
}