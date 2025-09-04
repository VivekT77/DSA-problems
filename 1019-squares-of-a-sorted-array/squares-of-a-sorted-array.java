class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left =0, right = n-1;
        int[] ans = new int[n];
        int ans_index = n- 1;

        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[ans_index] = nums[left] * nums[left];
                left++;
            }
            else{
                ans[ans_index] = nums[right] * nums[right];
                right--;
            }
            ans_index--;
        }
        return ans;
    }
}