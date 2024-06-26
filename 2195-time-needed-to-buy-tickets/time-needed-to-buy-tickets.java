class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int n = tickets.length;
        for(int i=0;i<n;i++){
            if(i<=k){
                if(tickets[i]<=tickets[k]){
                    time += tickets[i];
                }
                else{ 
                    time += tickets[k];
                }
            }
            else{
                if(tickets[i]<tickets[k]) {
                    time += tickets[i];
                }
                else {
                    time += tickets[k]-1;
                }
            }
            
        }

        return time;
    }
}