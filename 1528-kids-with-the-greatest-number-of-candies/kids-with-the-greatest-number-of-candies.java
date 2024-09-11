class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans = new ArrayList<>();
        for(int c : candies){
            int max = Arrays.stream(candies).max().getAsInt();
            if(c + extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}