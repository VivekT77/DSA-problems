class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);

        int curr_sum =0;
        int count =0;
        for(int num:nums){
            curr_sum += num;

            if(m.containsKey(curr_sum-k)){
                count += m.get(curr_sum-k);
            }
            m.put(curr_sum,m.getOrDefault(curr_sum,0) + 1);
        }
        return count;
    }
}