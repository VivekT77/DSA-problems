class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]%3==0){
                i++;
            }else{
                if(nums[i]%3==1){
                    count++;
                    i++;
                }else if(nums[i]%3==2){
                    count++;
                    i++;
                }
            }
        }
        return count;
    }
}