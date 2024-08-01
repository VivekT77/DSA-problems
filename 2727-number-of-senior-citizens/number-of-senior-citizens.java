class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for( String str:details){
            char v1 = str.charAt(11);
            char v2 = str.charAt(12);
            if(v1 > '6' || v1=='6' && v2 > '0'){
                count++;
            }
        }
        return count;
    }
}