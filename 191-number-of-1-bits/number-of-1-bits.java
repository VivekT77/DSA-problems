class Solution {
    public int hammingWeight(int n) {
        int count =0;
        for(int i=0;i<32;i++){
            if((n&1) == 1){     //in ANDing even one single zero gives '0' otherwise '1'
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}