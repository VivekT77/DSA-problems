class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length, min_length = Integer.MAX_VALUE , curr_sum =0, left =0;

        for(int right =0;right<n;right++){
            curr_sum += nums[right];
            while(curr_sum >= target){
                min_length = Math.min(min_length, right - left +1);
                curr_sum -= nums[left];
                left++;
            }
        }
        if(min_length == Integer.MAX_VALUE){
            return 0;
        }else{
            return min_length;
        }
    }
}