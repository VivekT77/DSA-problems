class Solution {
    public String losingPlayer(int x, int y) {
       int chance=0;
       while(x>0 && y>3){
        x=x-1;
        y=y-4;
        chance++;
       }
       String ans = chance % 2==0?"Bob":"Alice";
       return ans;
    }
}