class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int second_num = target - nums[i];
            if(m.containsKey(second_num)){
                return new int[]{i,m.get(second_num)};
            }
            m.put(nums[i] , i);

        }
        return new int[]{};
    }
}