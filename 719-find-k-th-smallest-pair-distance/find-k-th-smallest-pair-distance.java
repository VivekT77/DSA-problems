class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int n =nums.length;
        int right = nums[n-1];

        while(left<right){
            int mid = left + (right-left)/2;
            if(countpairs(nums,mid) < k){       //if the result is exceeding the mid then we have taken the
                left = mid+1;         //wrong mid decrease the result and if not exceeding means increase
            }else{                  //the result
                right = mid;
            }
        }
        return left;        //it will indicate the the smallest one
    }

    public int countpairs(int [] nums,int distance){
        int count=0;
        int left =0;
        
        for(int right =1;right<nums.length;right++){
            while(nums[right] - nums[left] > distance){     
                left++;
            }
            count += right-left;
        }
        return count;
    }
}