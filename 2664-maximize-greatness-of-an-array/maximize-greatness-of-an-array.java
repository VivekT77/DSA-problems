class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=0,count=0;

        while(j<nums.length){
            if(nums[j] > nums[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}