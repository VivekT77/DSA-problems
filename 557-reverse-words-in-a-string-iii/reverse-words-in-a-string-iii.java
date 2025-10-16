class Solution {
    public String reverseWords(String s) {

        // StringBuilder ans = new StringBuilder();
        // String[] words = s.split(" ");

        // for(int i=0;i<words.length;i++){

        //     StringBuilder sb = new StringBuilder(words[i]);
        //     sb.reverse();
        //     ans.append(sb);
            
        //     if(i<words.length-1){
        //         ans.append(" ");
        //     }
        // }
        // return ans.toString();

        Stack<Character>  st  = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                st.push(s.charAt(i));
            }
            else{
                while(!st.isEmpty()){
                    ans.append(st.pop());
                }

                ans.append(" ");
            }  
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        
        return ans.toString();
    }
}