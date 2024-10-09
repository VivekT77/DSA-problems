class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> st = new HashMap<>();  //initialize two maps to store chars from s to
        HashMap<Character,Character> ts = new HashMap<>();  //t and t to s

        for(int i=0;i<s.length();i++){
            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);

            if(st.containsKey(s_ch)){       //if the chars are present then check whether they are map to 
                if(st.get(s_ch) != t_ch){    //other char or not if yes then false otherwise put in map 
                    return false;
                }
            }
            else{
                st.put(s_ch,t_ch);
            }

            if(ts.containsKey(t_ch)){
                if(ts.get(t_ch) != s_ch){
                    return false;
                }
            }
            else{
                ts.put(t_ch,s_ch);
            }
        }
        return true;
    }
}