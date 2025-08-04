class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[] s1_freq = new int[26];
        int[] s2_freq = new int[26];

        if(m>n){
            return false;
        }

        for(int i=0;i<m;i++){
            s1_freq[s1.charAt(i)-'a']++;
            s2_freq[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<=n-m;i++){
            if(Arrays.equals(s1_freq,s2_freq)){
                return true;
            }

            if(i<n-m){
                s2_freq[s2.charAt(i)-'a']--;
                s2_freq[s2.charAt(i+m)-'a']++;
            }
        }
        return false;
    }
}