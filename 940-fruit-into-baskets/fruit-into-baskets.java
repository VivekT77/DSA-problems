class Solution {
    public int totalFruit(int[] fruits) {
        int max_fruits = 0;
        int left=0;
        HashMap<Integer,Integer> m = new HashMap<>();
        int n = fruits.length;

        for(int right=0;right<n;right++){
            m.put(fruits[right],m.getOrDefault(fruits[right],0) +1);

            while(m.size()>2){
                m.put(fruits[left],m.get(fruits[left])-1);
                
                if(m.get(fruits[left]) == 0){
                    m.remove(fruits[left]);
                }
                left++;
            }
            max_fruits = Math.max(max_fruits,right-left+1);
        }
        return max_fruits;
    }
}