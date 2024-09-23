class Solution {
    public int numberOfMatches(int n) {
        int total_matches = 0;
        int curr_matches;
        while(n!=1){
            if(n%2!=0){
                curr_matches = n/2;
                n = curr_matches +1;
            }
            else{
                curr_matches = n/2;
                n = curr_matches;
            }
            total_matches += curr_matches;
        }
        return total_matches;
    }
}