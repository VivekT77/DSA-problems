class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Integer> max_pq = new PriorityQueue<>((a,b) -> m.get(b)-m.get(a));
        max_pq.addAll(m.keySet());

        int[] topK = new int[k];
        for(int i=0;i<k;i++){
            topK[i] = max_pq.poll();
        }
        return topK;
    }
}