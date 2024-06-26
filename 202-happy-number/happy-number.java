class Solution {
//using LinkedList approach
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        } while(slow!=fast);

       if(slow==1){
        return true;
       }
       return false;
    }

    public int findsquare(int n){
        int ans=0;
        while(n>0){
            int remainder = n%10;
            ans += remainder*remainder;
            n /=10;
        }
        return ans;
    }
}