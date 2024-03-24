class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> ans  = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){
                return nums[i]; //if the element is already present in the set then return the array
            }else{
                ans.add(nums[i]); // if element not present then add it in the set
            }
        }
        return -1;
    }
}