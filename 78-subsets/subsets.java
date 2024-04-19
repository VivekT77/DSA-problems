class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());  //in outerlist for each iteration of the num new lists get added
                                      //like for 1=>2 lists,then for these 2 lists further 2 lists(t=4)
        for(int num : nums){
            int s = outer.size();
            for(int i=0;i<s;i++){
            //for new inner lists we need to access of outer list for the particular ith iteration
                List<Integer> inner = new ArrayList<>(outer.get(i)); 
                inner.add(num);  
                outer.add(inner);
            }
        }
        return outer;
    }
}