class Solution {
    public int lengthOfLongestSubstring(String s) {
    //2nd approach

        HashMap<Character,Integer> m = new HashMap<>();
        int max_len =0;
        int left=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(m.containsKey(ch) && m.get(ch) >= left){
                left = m.get(ch) + 1;
            }
            m.put(ch,i);
            max_len = Math.max(max_len , i-left + 1);
        }
        return max_len;
    }
}