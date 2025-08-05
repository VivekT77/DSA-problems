class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count=0, left=0, n=nums.length, product=1;

        for(int right=0;right<n;right++){
            product *= nums[right];
            while(product>=k){
                product /= nums[left];
                left++;
                if(left>right){
                    break;
                }
            }
            count += right-left + 1;
        }
        return count; 
    }
}