class Solution {
    public boolean check(int[] nums) {
// to see whether the array is sorted,there must be single or zero drop between the elements      
        int drop = 0;
        int n =nums.length;

        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                drop++;
            }
        }
        if(nums[0]<nums[n-1]){ //for eg see case 2 
            drop++;
        }
        if(drop>1){
            return false;
        }else{
            return true;
        }
    }
}