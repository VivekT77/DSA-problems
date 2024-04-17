class Solution {
    public List<String> letterCombinations(String digits) {
        String result ="";
        ArrayList<String> ans = new ArrayList<>();
        if(digits.length() == 0){      // edge case (test case2) 
            return new ArrayList();
        }
        ans = answer(result,digits);
        return ans;
    }

    public ArrayList<String> answer(String update,String old){
        // base condition
        if(old.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(update); 
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = old.charAt(0)-'0';  

//to get the range of the strings eg:for abc the range is 0,1,2 and for def id 3,4,5
        if(digit <=6 ){
        for(int i =(digit-2)*3; i<(digit-1)*3 ;i++){  
            char ch = (char)('a'+i);  // it gives the ascii value therefore convert it in char
            ans.addAll(answer(update + ch, old.substring(1))); //either take it or leave it subset logic
        }
        }
        if(digit==7)
        {
             for(int i =(digit-2)*3; i<=(digit-1)*3; i++) {
            char ch = (char) ('a' + i);
           ans.addAll( answer(update + ch, old.substring(1)));
        }
        }
        if(digit==8)
        {
             for(int i =((digit-2)*3)+1; i<=(digit-1)*3 ;i++) {
            char ch = (char) ('a' + i);
           ans.addAll( answer(update + ch, old.substring(1)));
        }
        }

        if(digit==9)
        {
             for (int i =((digit-2)*3)+1; i<=((digit-1)*3)+1 ;i++) {
            char ch = (char) ('a' + i);
           ans.addAll(answer(update + ch, old.substring(1)));
        }
        }
        return ans;
    }
}