// logic=> trim the string so that the spaces at starting and ending gets cut,convert the new string into array of a string to iterate over the alphabet and make one string builder to store the reverse string,always start from back when we want reversed string add all the words and spaces from ans array to string builder
class Solution {
    public String reverseWords(String s) {
        String[] ans = s.split(" +");
        StringBuilder sb =new StringBuilder();
        for(int i=ans.length-1;i>=0;i--){
            sb.append(ans[i]);            
            sb.append(" ");            
        }
        return sb.toString().trim();
    }
}