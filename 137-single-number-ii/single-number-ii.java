class Solution {
    public int singleNumber(int[] nums) {

//2nd approach to iterate over the map
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int n : nums){
            m.put(n,m.getOrDefault(n,0) + 1);
        }

        for(int i : m.keySet()){        //to make the keys of the key,value pair in one set
            if(m.get(i)==1){            //to gets the value for that particular key
                return i;
            }
        }
        return 0;
    }
}