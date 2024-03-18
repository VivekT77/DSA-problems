class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length(); //check whether all the characters in s has matched,it means the index  while pointer is at last index of s will be equal of s's length
    }
}