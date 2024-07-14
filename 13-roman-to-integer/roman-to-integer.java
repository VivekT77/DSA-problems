class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int v = 0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            switch(ch){
               case  'I':
               v=1;
               break;
               case  'V':
               v=5;
               break;
               case  'X':
               v=10;
               break;
               case  'L':
               v=50;
               break;
               case  'C':
               v=100;
               break;
               case  'D':
               v=500;
               break;
               case  'M':
               v=1000;
               break;
            }
            if(4*v < ans){
                ans -= v;
            }else{
                ans += v;
            }
        }
        return ans;
    }
}