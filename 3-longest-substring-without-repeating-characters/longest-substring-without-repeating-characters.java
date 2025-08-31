class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left=0;
        int max_length=0;
        HashMap<Character,Integer> m = new HashMap<>();

        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            if(m.containsKey(ch) && m.get(ch) >= left){
                left = m.get(ch) + 1;
            }
            m.put(ch,right);
            max_length = Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}   