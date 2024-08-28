class Solution {

    public class Pair{      //similar to the Priority queue questions
        int index;                              //initialize , make constructor
        int value;

        Pair(int index,int value){
            this.index=index;
            this.value=value;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b) -> b.value-a.value);
        int n = nums.length;
        int[] ans = new int[n-k+1];     //size should be of no.of windows

        for(int i=0;i<k;i++){
            pq.add(new Pair(i,nums[i]));        //initially add the k points in PQ
        }
        ans[0] = pq.peek().value;           //the start element in the PQ will be the max hence put in ans 

        for(int i=k;i<n;i++){
            while(pq.size() > 0 && pq.peek().index <=(i-k)){  //check whether the peek element gets out   
                pq.remove();           //from the size of itertaing windows at each point,if there remove it
            }
            pq.add(new Pair(i,nums[i]));        //add the next element from the array to the PQ
            ans[i-k+1] = pq.peek().value;       //start assigning from the index 1 as index 0 is filled
        }                                       //initally only
        return ans;
    }
}