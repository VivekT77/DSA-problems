class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Integer> min_pq = new PriorityQueue<>((a,b) -> m.get(a)-m.get(b));
        for(int num:m.keySet()){
            min_pq.add(num);
            if(min_pq.size()>k){
                min_pq.poll();
            }
        }

        int[] topK = new int[k];
        for(int i=k-1;i>=0;i--){
            topK[i] = min_pq.poll();
        }
        return topK;
    }
}