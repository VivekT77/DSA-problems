class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");

        for(int i =0;i< words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();

            ans.append(sb);

            if(i< words.length-1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}