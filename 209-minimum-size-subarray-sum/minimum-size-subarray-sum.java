class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int min_len = Integer.MAX_VALUE;
        int left=0;
        int curr_sum=0;

        for(int right = 0;right<nums.length;right++){
                curr_sum += nums[right];
            while(curr_sum>=target){
                min_len = Math.min(min_len , right-left + 1);
                curr_sum -= nums[left];
                left++;
            }
        }
        return min_len == Integer.MAX_VALUE ? 0 : min_len;
    }
}