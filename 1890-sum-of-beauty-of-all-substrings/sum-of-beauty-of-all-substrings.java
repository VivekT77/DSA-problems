class Solution {
    public int beautySum(String s) {

        int ans=0;
        for(int i=0;i<s.length();i++){
            int [] freq = new int[26];      //to store the frequency if the characters
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);  //to store the last index of the particular substring 
                freq[ch-'a']++;

                int min = Integer.MAX_VALUE;  //initialize the min and max 
                int max = Integer.MIN_VALUE;

                for(int k=0;k<26;k++){      //iterate over the frequency array
                    if(freq[k]>0){      
                        min = Math.min(min,freq[k]);    //find the min and max for the particular substring
                        max = Math.max(max,freq[k]);
                    }
                }
                ans += max-min;     //update the the diff between the most and least frequent characters
            }
        }
        return ans;
    }
}