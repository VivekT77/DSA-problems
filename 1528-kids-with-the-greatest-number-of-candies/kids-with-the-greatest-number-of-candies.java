class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        // List<Boolean> ans = new ArrayList<>();
        // for(int c : candies){
        //     int max = Arrays.stream(candies).max().getAsInt();
        //     if(c + extraCandies >= max){
        //         ans.add(true);
        //     }else{
        //         ans.add(false);
        //     }
        // }
        // return ans;

        // 2nd approach
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int c:candies){
            if(c>max){
                max=c;
            }
        }

        for(int c : candies){
            if(c + extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}