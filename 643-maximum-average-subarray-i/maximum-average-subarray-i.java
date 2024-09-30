class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){       //first add the k elements to get the sum
            sum +=nums[i];
        }

        double max_sum = sum;
        for(int i=k;i<nums.length;i++){  //after that update the sum by adding next element and removing
            sum += nums[i] - nums[i-k];     //previous element untill next 5 elements are added
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum/k;       //average of the subarray
    }
}