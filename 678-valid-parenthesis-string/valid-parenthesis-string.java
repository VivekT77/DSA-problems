class Solution {
    public boolean checkValidString(String s) {
        int lcount = 0, rcount = 0;
        for(char ch : s.toCharArray()){ //one by one char is analyze
            lcount += ch == '(' ? +1 : -1;
            rcount += ch == ')' ? -1 : +1;

            if(rcount<0){
                return false; //like )))
            }
            lcount = Math.max(lcount,0); 
        }
        return lcount==0; //means stack is empty
    }
}