//logic=> we will iterate one by one and when the sum of the previous sides is greater than the current element 
// then we will add the current element with the prefix_sum till the condition get false 
class Solution {
    public long largestPerimeter(int[] nums) {
        long prefix_sum =0, ans= -1;
        Arrays.sort(nums);
        for(int num:nums){
            if(prefix_sum > num){
                ans = prefix_sum + num;
            }
            prefix_sum += num;
        }
        return ans;
    }
}