class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n,m.getOrDefault(n,0) + 1);
        }

        for(Map.Entry<Integer,Integer> ans : m.entrySet()){
            if(ans.getValue() == 1){
                return ans.getKey();
            }
        }
        return -1;
    }
}