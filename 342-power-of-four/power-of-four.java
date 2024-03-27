class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true; // base condition
        if(n%4!=0 || n==0){
            return false;
        }
 //keep dividing the no. till it becomes 1 or 0 for satisfying the above condition;       
        return isPowerOfFour(n/4);
    }
}