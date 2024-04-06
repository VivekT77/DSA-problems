class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0]; 
        int max = nums[nums.length-1]; 
        int result = -1;
        for(int num : nums){
            if(num!= min && num!=max){
                result=num;
            }
        }
        return result;
    }
}