class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end = nums.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[start] == nums[mid] && nums[end] == nums[mid]){ //edge case eg [3,3,1,3]
                start++;
                end--;
            }
            else if(nums[mid] <= nums[end]){ //it means right side is sorted search in left
                end=mid;
            }else{
                start =mid+1;   //it means left side is sorted search in right
            }
        }
        return nums[start];
    }
}