class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int insert=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                open++;
                i++;
            }else{
                if(i+1<s.length() && s.charAt(i+1)==')'){ //double ))
                    if(open>0){  //if already '(' is present cancelled out with the present "))"
                        open--;
                    }else{
                        insert++;   //otherwise "(" needed
                    }
                    i+=2;
                }
                else{      // single ")"
                    if(open>0){
                        open--;   
                        insert++;  //to make it valid parenthesis
                    }else{
                        insert += 2;  //if for ")" single "(" is not present then add "(" and ")"
                    }
                    i++;
                }
            }
        }
        insert += open*2;
        return insert;
    }
}