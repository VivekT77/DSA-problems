class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int i=0,j=0;
        while(i<s_arr.length && j<t_arr.length){
            if(s_arr[i]==t_arr[j]){
                i++;
            }
            j++;
        }
        return i==s_arr.length; //check whether all the characters in s has matched, and if the count of i == arr.length it means all the characters are present in subsequence
    }
}