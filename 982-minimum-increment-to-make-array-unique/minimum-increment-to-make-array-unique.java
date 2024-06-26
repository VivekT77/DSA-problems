class Solution {
    public int minIncrementForUnique(int[] nums) {
         Arrays.sort(nums);
         int moves=0;
         for(int i=0;i<nums.length-1;i++){
            if(nums[i] >= nums[i+1]){
                moves += nums[i]-nums[i+1] + 1;
                nums[i+1]=nums[i]+1;
            }
         }
         return moves;    
    }
}