class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(index[i] , nums[i]);
        }   

        int [] ans = new int[nums.length];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;      
    }
}