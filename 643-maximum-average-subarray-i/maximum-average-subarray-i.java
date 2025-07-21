class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int window_sum = 0;
        int n = nums.length;

        for(int i=0;i<k;i++){
            window_sum += nums[i];
        }

        double max_sum = window_sum;
        for(int j=k;j<n;j++){
            window_sum += nums[j] - nums[j-k];
            max_sum = Math.max(max_sum,window_sum);
        }

        return max_sum/k;
    }
}