class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                l.add(sum);
            }
        }
        Collections.sort(l);
        int ans=0;
        for(int i=left-1;i<right;i++){
            ans = (ans + l.get(i))%1000000007;
        }
        return ans;
    }
}