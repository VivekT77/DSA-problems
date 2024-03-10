class Solution {
    public int countOdds(int low, int high) {
// if high-low is even then no of odd are odds        
        if(low%2==0 && high%2==0){
            return (high-low)/2;
        }else{
            return (high-low)/2 + 1 ;
        }
    }
}