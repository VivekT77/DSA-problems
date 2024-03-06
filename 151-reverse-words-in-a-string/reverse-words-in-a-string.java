class Solution {
    public String reverseWords(String s) {
// remove leading or trailing spaces use trim()
//trimmed string is then split into an array of words by split(" +");
//" +" is use for one or more spaces
        String[] trimmed_one = s.trim().split(" +"); 
        String ans  ="";
        for(int i=trimmed_one.length-1;i>0;i--){
//letters is added and  spaces between two words            
            ans += trimmed_one[i] + " "; 
        }
        return ans + trimmed_one[0];
    }
}