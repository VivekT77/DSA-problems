//logic=>sorted array apply BS,there will be 3 cases mid can be single element and left or right 
//if mids post and prefix is not same it means mid is the element,array can be even or odd
// for even and odd if mid & mids+1 and mid & mids previous is same respectiverly it means single element lies in right bcoz duplicates will occur left side
// else search in left array
class Solution {
    public int singleNonDuplicate(int[] nums) {
         int n= nums.length;
         if (n==1)
            return nums[0];
         if(nums[0]!=nums[1]){
             return nums[0];
         }   
         if(nums[n-1]!=nums[n-2]){
             return nums[n-1];
         }
        int start=0,end=n-1;
        while(start<=end){
            int mid= start +(end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if((mid%2==0 && nums[mid] == nums[mid+1]) ||(mid%2==1 && nums[mid] == nums[mid-1])){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}