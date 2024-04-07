class Solution {
    public int lastRemaining(int n) {
        if(n==1){
             return n;
        }
// n/2 bcoz we take one after the another and +1 bcoz of odd n        
        return 2*(n/2-lastRemaining(n/2)+1);
    }
}