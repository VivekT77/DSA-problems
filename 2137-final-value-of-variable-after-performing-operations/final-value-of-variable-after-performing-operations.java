class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(String str:operations){
            if(str.equals("++X") ||str.equals("X++")){
                count++;
            }else{
                count--;
            }
        }
        return count;
    }
}