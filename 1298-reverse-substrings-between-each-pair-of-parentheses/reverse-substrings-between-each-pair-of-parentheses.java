class Solution {
    public String reverseParentheses(String s) {
        char[] str = s.toCharArray();   //convert to array to iterate efficiently
        return help(str);   
    }

    int i=0; //it is treated as a global variable used to track the current position of chars in
                //recursive calls as it will bw pass from help to main function
    public String help(char[] s){
        StringBuilder sb= new StringBuilder();  //to store the substrings
        
        while(i<s.length){

            if(s[i]=='('){   //at beginning if "(" is found then it will call the recursive call
                i++;        // or new recursion gets started for substrings and append it in sb 
                String S = help(s);
                sb.append(S);
            }else if(s[i]==')'){    //if pointer comes to end then just reverse the stored 
                i++;                //substring
                return sb.reverse().toString();
            }else{
                sb.append(s[i]);    //others chars just get casually added
                i++;
            }
        }
        return sb.toString();
    }
}