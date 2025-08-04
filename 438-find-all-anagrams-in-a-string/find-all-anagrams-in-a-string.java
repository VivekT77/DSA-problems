class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        ArrayList<Integer> ans = new ArrayList<>();

        int[] s_freq = new int[26]; //to store the frequency of the elements
        int[] p_freq = new int[26];

        if(n>m){
            return ans;
        }

        for(char c:p.toCharArray()){    
            p_freq[c-'a']++;
        }

        for(int i=0;i<n;i++){   //exactly store the p no. of elements in s_freq to compare
            s_freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<=m-n;i++){    //iterate the s string till m-n as p won't reach at last
            if(Arrays.equals(s_freq,p_freq)){       //compare and add wherever anagram is there
                ans.add(i);     
            }
            if(i<m-n){        //slide the window,add the next element and remove previous
                s_freq[s.charAt(i+n)-'a']++;
                s_freq[s.charAt(i)-'a']--;
            }
        }
        return ans;
    }
}