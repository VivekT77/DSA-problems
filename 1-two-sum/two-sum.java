class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> index = new HashMap<>();
        for(int i=0;i<nums.length;i++){

            int second_num = target-nums[i];
            if(index.containsKey(second_num)){
                return new int[]{index.get(second_num),i};
            }
            index.put(nums[i],i);
        }
        return new int[]{}; 
    }
}