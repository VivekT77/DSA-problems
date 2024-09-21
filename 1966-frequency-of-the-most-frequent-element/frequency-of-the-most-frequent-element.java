class Solution {
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);      //first sort the elements to get the no. lesser than no. which are going 
        int left = 0, right =0 ;        
        long total_sum =0;         
        
        while(right<nums.length){       
            total_sum += nums[right];   //calculate the sum for the particular window during operations

            long requiredSum = (long)nums[right] * (right - left + 1);//till the window size*right size 's
            long diff = requiredSum - total_sum;      //elements value is greater than sum + k value

            if( diff > k){ 
                total_sum -= nums[left];     
                left++;                                 //and update the window
            }                   
            right++;
        }
        return right - left;
    }
}