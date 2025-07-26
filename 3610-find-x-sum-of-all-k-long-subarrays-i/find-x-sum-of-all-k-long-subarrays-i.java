class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n-k+1]; //to store the sum of the subarray's

        for(int i=0;i<=n-k;i++){
            int[] subarray = Arrays.copyOfRange(nums,i,i+k); //segregate the subarrays  
            result[i] = Calculate_Xsum(subarray,x);     //calculate sum for each subarray
        }
        return result;
    }

    public int Calculate_Xsum(int[] subarray,int x){

        HashMap<Integer,Integer> freq = new HashMap<>();  //for countung the frequency of no's
        for(int num:subarray){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> { //to sort the no's according
            int count_A = freq.get(a);     //to the condition mention in question
            int count_B = freq.get(b);
            if(count_A != count_B){
                return count_B - count_A;
            }else{
                return b-a;
            }
        });

        for(int num:freq.keySet()){   //add the keys of the hashmap in the queue
            pq.offer(num);
        }

        int sum=0;
        HashSet<Integer> topX = new HashSet<>();    
        for(int i=0;i<x && !pq.isEmpty();i++){  //select top most frequent no's from Priority Q
            topX.add(pq.poll());
        }

        for(int num:subarray){      //calculate the sum for these selected elements
            if(freq.size() <= x || topX.contains(num)){
                sum += num;
            }
        }
        return sum;
    }
}