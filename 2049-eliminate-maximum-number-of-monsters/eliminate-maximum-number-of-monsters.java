class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        double[] arrival_time = new double[n];

        for(int i=0;i<n;i++){
            arrival_time[i] = (double)dist[i]/speed[i];
        }

        Arrays.sort(arrival_time);

        int monsters_eliminated =0;
        for(int i=0;i<n;i++){
            if(arrival_time[i] <= i){
                return monsters_eliminated;
            }
            monsters_eliminated++;
        }
        return n;
    }
}