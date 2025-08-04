class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<n;i++){
            if(freq.containsKey(nums[i]) && (i-freq.get(nums[i]) <= k)){
                return true;
            }
            freq.put(nums[i],i);
        }
        return false;
    }
}