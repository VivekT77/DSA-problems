//logic: treat 0 as -1 ,so -1+1 will get cancelled and sum will be zero, go till the you encounter the same prefix sum again, it means subarray between the current index and the index stored in the hashmap has a sum of 0 and return the max_length.store the sum in hashmap and fetch when needed

class Solution {
    public int findMaxLength(int[] nums) {
        int n =nums.length;
        int max_length =0;
        int prefix_sum =0;  //when we want to calculate How many times something happen up to 
                            //index k use prefix_sum (like equal no. of zeros and ones)
        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,-1); // initalize with sum 0 at index -1

        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                prefix_sum += -1;
            }
            else{
                prefix_sum += 1;
            }

            if(m.containsKey(prefix_sum)){  //
                max_length = Math.max(max_length, i - m.get(prefix_sum));
            }else{
                m.put(prefix_sum,i);
            }
        }
        return max_length;
    }
}