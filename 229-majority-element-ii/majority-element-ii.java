class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer,Integer> m = new HashMap<>();       //key => number , value => frequency of the no.
        for(int i=0;i<nums.length;i++){
            // if(m.containsKey(nums[i])){          //if number is present increase the freq by one             
            //     m.put(nums[i],m.get(nums[i]) + 1);
            // }else{
            //     m.put(nums[i], 1);          //otherwise add new object
            // }

            m.put(nums[i] , m.getOrDefault(nums[i], 0) + 1);  
        }

        // Set<Integer> keys = m.keySet();         //to iterate over the hashmap,use Set DS
        List<Integer> ans = new ArrayList<>();

        for(int key:m.keySet()){
            if(m.get(key) > nums.length/3){     //if the freq of key is > n/3 then add in ans
                ans.add(key);
            }
        }
        return ans; 
    }
}