class Solution {
    public int hIndex(int[] citations) {
        // 2nd approach
        int n = citations.length;
        int [] freq = new int[n+1];
        
        for(int num : citations){
            if(num >= n){
                freq[n]++;
            }else{
                freq[num]++;
            }
        }

        int count =0;
        for(int i=n;i>=0;i--){
            count += freq[i];
            if(count >= i){
                return i;
            } 
        }
        return 0;
    }
}