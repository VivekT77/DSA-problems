class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        ans.add(new int []{intervals[0][0],intervals[0][1]});
        

        for(int i=1;i<n;i++){
            int[] last = ans.get(ans.size()-1);
            int[] curr = intervals[i];

            if(last[1]>= curr[0]){
                last[1] = Math.max(last[1],curr[1]);
            }
            else{
                ans.add(new int[]{curr[0],curr[1]});
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}