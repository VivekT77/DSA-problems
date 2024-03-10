class Solution {
    public int countOdds(int low, int high) {
// if both no.s even then odd no will be even's like 8 and 10
        if(low%2==0 && high%2==0){
            return (high-low)/2;
        }
// if both no.s odd then odd no.s will be odd like 3 and 7    
        else if(low%2==1 && high%2==1){
            return (high-low)/2 + 1 ;
        }
// if both no.s even then odd no will be even's like 4 and 7        
        else{
            return (high-low +1)/2;
        }
    }
}