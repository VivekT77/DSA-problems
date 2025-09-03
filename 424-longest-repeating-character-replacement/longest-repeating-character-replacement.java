class Solution {
    public int characterReplacement(String s, int k) {
         int left =0;
         int right = 0;
         int max_length = 0;
         int [] char_freq = new int[26];
         int max_charCount =0;

        while(right<s.length()){
            char ch = s.charAt(right);
            char_freq[ch-'A']++;
            max_charCount = Math.max(max_charCount,char_freq[ch-'A']);

            while((right-left+1)- max_charCount > k){
                char left_ch = s.charAt(left);
                char_freq[left_ch-'A']--;
                left++;
            }

            max_length = Math.max(max_length,right-left+1);
            right++;
        }
        return max_length;
    }
} 