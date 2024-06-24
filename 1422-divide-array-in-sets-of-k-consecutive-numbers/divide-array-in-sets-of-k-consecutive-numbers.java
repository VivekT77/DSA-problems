class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0){  //edge case
            return false;
        }

        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            PQ.add(nums[i]);
        }

        while(!PQ.isEmpty()){
            int start = PQ.poll();  //smallest element of the current queue
            start++;
 
            int j=0;               
            while(j<k-1){   //to start from the current element not from starting element
                if(PQ.contains(start)){     //if the queue contains one more previous start then it will
                    PQ.remove(start);       //be use to start the next list from the same element
                    start++;
                }else{
                    return false;
                }
                j++;
            }
        }
        return true;
    }
}