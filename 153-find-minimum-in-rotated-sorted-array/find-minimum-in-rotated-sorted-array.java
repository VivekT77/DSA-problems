//logic=> use BS as we wnt to search in sorted array, first we will see if the mid is greater than 
//end if yes it means after mid there will be ascending array where the start element will be the
 //lowest otherwise the first half will be the sorted array and the index 0 will be the smallest
class Solution {
    public int findMin(int[] nums) {
        int start= 0,end=nums.length-1;
        while(start<end){
            int mid =start + (end-start)/2;
            if(nums[mid]>nums[end]){
                start = mid+1;
            }else{
                end=mid;
            }
        }
        return nums[start];
    }
}