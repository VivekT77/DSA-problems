class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<citations.length;i++){
            if(citations[i]>= n-i){
                l.add(citations[i]);
            }
        }
        return l.size();
    }
}