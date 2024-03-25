class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        reverse(nums,0,n-1); // 7,6,5,4,3,2,1 reverse array to get the end elements at starting
        reverse(nums,0,k-1);           // 5,6,7,4,3,2,1 first reverse k elements then the remaining one's
        reverse(nums,k,n-1);  //5,6,7,1,2,3,4
    }
//Function for swapping
    public void reverse(int[] nums , int start, int end ){
            while(start<=end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
}