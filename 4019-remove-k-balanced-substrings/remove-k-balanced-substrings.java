class Solution {
    public String removeSubstring(String s, int k) {

        int n = s.length();
        char[] stack = new char[n];
        int top = -1;

        for(char ch : s.toCharArray()){
            stack[++top] = ch;

            if(top >= 2*k -1){
                boolean is_KBalanced = true;

                for(int i=0;i<k;i++){
                    if(stack[top-i] != ')' || stack[top-k-i] != '('){
                        is_KBalanced = false;
                        break;
                    }
                }

                if(is_KBalanced){
                    top -= 2*k;
                }
            }
        }
        return new String(stack,0,top+1);
    }
}