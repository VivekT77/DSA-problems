//using MERGE SORT
class Solution {
    public void divide(int []nums,int l,int r){
        if(l>=r){
            return;
        }
        int m= l + (r-l)/2;
        divide(nums,l,m);
        divide(nums,m+1,r);
        merge(nums,l,m,r);
    }
    public void merge(int[] nums, int l ,int m,int r){
        int [] ans = new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=r){
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
        while(j<=r){
            ans[k]=nums[j];
            j++;
            k++;
        }
        for(int v=0;v<ans.length;v++){
            nums[l+v] =ans[v];
        }
    }
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length-1);
        return nums;
    }
}