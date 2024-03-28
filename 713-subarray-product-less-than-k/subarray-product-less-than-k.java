class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0; //there can't be postive subarrays with such k value
        int count=0;
        int product = 1;
        int start = 0;
        int end = 0;

        while(end<nums.length){ // till it reaches end,calculate the product by multiplying the last element of the particular subarray       
            product *= nums[end]; 

         while(product >= k){
            product /= nums[start]; //to get the last digit cutoff we divide it,same way divide the k value with the starting element of the particular subarray
            start++; //move forward to add the next index in the sliding window
         }
         count += (end - start)+ 1; // to count the no. of subarrays , +1 is done so that it can count the last itself as a single subarray like 5,10,2 in the increasing process
         end++;
      }
      return count;
    }
}