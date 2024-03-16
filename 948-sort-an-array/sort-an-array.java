//using MERGE SORT
class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
    public void divide(int []nums,int left ,int right){
        if(left>=right){
            return;
        }
        int m= left + (right-left)/2;
        divide(nums,left,m);
        divide(nums,m+1,right);
        merge(nums,left,m,right);
    }
    public void merge(int[] nums, int left ,int m,int right){
        int [] ans = new int[right-left+1];
        int i=left;
        int j=m+1;
        int k=0;
        while(i<=m && j<=right){
            if(nums[i]<nums[j]){
                ans[k]=nums[i];
                i++;
            }else{
                ans[k]=nums[j];
                j++;
            }
            k++;
        }

        while(i<=m){
            ans[k]=nums[i];
            i++;
            k++;
        }
        while(j<=right){
            ans[k]=nums[j];
            j++;
            k++;
        }
        for(int v=0;v<ans.length;v++){
            nums[left+v] =ans[v];
        }
    }
}