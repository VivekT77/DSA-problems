class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];

        //we have use dq to store the indices of the values
        Deque<Integer> dq = new ArrayDeque<>();   //deque is interface , can be implemented by
        for(int i=0;i<n;i++){                  // by ArratDeque class or linkedlist

            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();      //compare the current value with the other values in dq,
            }                       //remove the values which are less than it
            
            dq.offer(i);        //after that add the value in deque

            if(dq.peek() <= i-k){  //now see if first element is out of the window size or not
                dq.poll();              //if there remove it
            }

            if(i>=k-1){         //till now the max element get positioned at peek,hence add it
                ans[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}