class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();

        ArrayList<Integer> result = new ArrayList<>();

        int[] freq_s = new int[26];
        int[] freq_p = new int[26];

        if(n>m){
            return result;
        }

        for(int i=0;i<n;i++){
            freq_s[s.charAt(i) -'a']++;
            freq_p[p.charAt(i) -'a']++;
        }

        for(int i=0;i<=m-n;i++){
            if(Arrays.equals(freq_s,freq_p)){
                result.add(i);
            }

            if(i<m-n){
                freq_s[s.charAt(i+n) - 'a']++;
                freq_s[s.charAt(i) - 'a']--;
            }
        }
        return result;
    }
}