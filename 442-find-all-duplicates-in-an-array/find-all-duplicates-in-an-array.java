//logic=> 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int [] count = new int[nums.length+1]; //as the index starts from 0a nd there are 1 to N numbers
        for(int frequency :nums){
            count[frequency]++; //store the frequency of a particular element in the particular index
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=1;i<=nums.length;i++){     // now iterate over the count array to count the frequency 
            if(count[i]==2){
                ans.add(i);
            }
        }
        return ans;
    }
}