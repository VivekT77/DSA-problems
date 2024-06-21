class Solution {
    public int minAddToMakeValid(String s) {
        // stack approach
        // Stack<Character> st = new Stack<>(); //eg: "(()("
        // for(char ch : s.toCharArray()){
        //     if(ch==')'){
        //         if(!st.isEmpty() && st.peek()=='('){ 
        //             st.pop();     //as they will cancel each other
        //         }else{
        //             st.push(ch); //otherwise push it like ")))"
        //         }
        //     }else{
        //         st.push(ch); 
        //     }
        // }
        // return st.size(); 

        int open=0;
        int close=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                open++;
            }else if(ch==')' && open==0){
                close++;
            }else{
                open--;
            }
        }
        return open +close;
    }
}