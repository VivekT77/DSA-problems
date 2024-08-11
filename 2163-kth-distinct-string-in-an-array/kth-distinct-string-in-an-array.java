class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String,Integer> m = new HashMap<>();
        for(String str : arr){
            m.put(str, m.getOrDefault(str,0) + 1); 
        }

        int count = 0;
        String ans ="";
        for(String s :arr){
            if(m.get(s)==1){
                ans=s;
                count++;
            }
            if(count==k){
                return ans;
            }
        }
        return "";
    }
}