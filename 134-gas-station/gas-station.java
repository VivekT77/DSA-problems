class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int current_gas = 0;
        int start =0;

        for(int i=0;i<gas.length;i++){
            current_gas += gas[i] - cost[i];
            total_gas += gas[i] - cost[i];

            if(current_gas< 0){
                current_gas = 0;
                start = i+1;
            }
        }
        if(total_gas >= 0){
            return start;
        }
        else{
            return -1;
        }
    }
}