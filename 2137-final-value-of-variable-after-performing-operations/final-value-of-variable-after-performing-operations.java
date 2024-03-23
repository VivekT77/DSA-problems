// without using built in functions
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String str:operations){
            if(str.charAt(1) == '+'){ //look at 2 index of a  particular string whether to add or minus
                count++;
            }else{
                count--;
            }
        }
        return count;
    }
}