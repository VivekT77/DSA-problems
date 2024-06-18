class Solution {
    public void reverseString(char[] s) {
        //stack approach
        Stack<Character> st = new Stack<>();
        for(char c:s){
            st.push(c);
        }
        for(int i=0;i<s.length;i++){
            s[i]=st.pop();

        }
    }
}