class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){     //if the value is present in the hashmap then compare
                if(i - m.get(nums[i]) <= k){    //otherwise add in the map and while adding if the 
                    return true;        //element is found similar to the no. already present then
                }                        //check foe the condition 
            }
            m.put(nums[i],i);
        }
        return false;
    }
}