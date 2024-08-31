class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> m = new HashMap<>();
        int max_len =0;
        int left_index = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            m.put(ch,m.getOrDefault(ch,0) + 1);

            while(m.get(ch) > 1){
                char left_ch = s.charAt(left_index);
               m.put(left_ch , m.get(left_ch) - 1);
               left_index++;
            }
            max_len = Math.max(max_len , i-left_index+1);
        }
    return max_len;
    }
}