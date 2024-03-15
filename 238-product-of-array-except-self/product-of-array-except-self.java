//logic=> calculate the preproduct and post from the element and multiply the both to get the whole product,the initial elements of the arrays will be "1" prefix will be the product of previous elements therefore i-1 and post will be i+1
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] pre_sum = new int[n]; 
        int [] post_sum = new int[n];

        pre_sum[0]=1;
        post_sum[n-1]=1;

        for(int i=1;i<n;i++){
            pre_sum[i] = pre_sum[i-1] * nums[i-1]; // nums[i] is not bcoz we have find except it
        }

        for(int i=n-2;i>=0;i--){
            post_sum[i] = post_sum[i+1] * nums[i+1]; //same here
        }

        int [] result =new int[n];
        
        for(int i=0;i<n;i++){
            result[i] = pre_sum[i] * post_sum[i];
        }
        return result;
    }
}