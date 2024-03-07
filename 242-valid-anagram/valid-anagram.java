class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] s_ch = s.toCharArray();
        char[] t_ch = t.toCharArray();
        Arrays.sort(s_ch);  
        Arrays.sort(t_ch);
        for(int i=0;i<s_ch.length;i++){
            if(s_ch[i]!=t_ch[i]){
                return false;
            }
        }
        return true;  
    }
}