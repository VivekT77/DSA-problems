class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0;
        int n =nums.length;
        int right = nums[n-1];

        while(left<right){
            int mid = left + (right-left)/2;
            int min_distance = countpairs(nums,mid);
            if(min_distance >= k){       //if the result is exceeding the mid then we have taken the
                right = mid;         //wrong mid decrease the result and if not exceeding means increase
            }else{                  //the result
                left = mid+1;
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