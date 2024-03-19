class Solution {
    public int minBitFlips(int start, int goal) {
        int steps=0;
        
        while(start>0 || goal>0){
            if((start&(1))!=(goal&(1))){ //if it becomes equal means we have got the ans 
                steps++;
            }
//Compare LSB of both start and goal, keep right shifting by 1 until it is greater than 0.            
                start=start>>1;
                goal=goal>>1;
        }
        return steps;
    }
}