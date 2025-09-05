class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = Integer.MAX_VALUE;
        int n= nums.length;

        for(int i=0;i<n-2;i++){
            int left =i+1;
            int right = n-1;

            while(left<right){
                int curr_sum = nums[i] + nums[left] + nums[right];
                
                if(Math.abs(curr_sum - target) < Math.abs(closest_sum - target)){
                    closest_sum = curr_sum;
                }
                if(curr_sum < target){
                    left++;
                }
                else if(curr_sum > target){
                    right--;
                }
                else{
                    return target;
                }
            }
        }
        return closest_sum;
    }
}