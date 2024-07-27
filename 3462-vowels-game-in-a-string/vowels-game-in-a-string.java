class Solution {
    public boolean doesAliceWin(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                count++;
            }
        }
        if(count==0){
            return false;
        }
        return true;
    }
}