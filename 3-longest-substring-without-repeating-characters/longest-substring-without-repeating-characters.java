class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max_length =0;
        HashSet<Character> char_count = new HashSet<>();
        int n = s.length();

        for(int right=0;right<n;right++){
            while(char_count.contains(s.charAt(right))){
                char_count.remove(s.charAt(left));
                left++;
            }
            char_count.add(s.charAt(right));
            max_length = Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}