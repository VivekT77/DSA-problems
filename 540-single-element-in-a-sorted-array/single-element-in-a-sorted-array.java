//logic=> XOR of number with itself gives '0' and with zero gives the number back.hence the 
//duplicates will become zero and one element will remain
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans =ans ^ nums[i];
        }
        return ans;
    }
}