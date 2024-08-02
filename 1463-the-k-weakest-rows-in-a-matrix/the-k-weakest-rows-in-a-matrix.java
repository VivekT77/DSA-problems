class Solution {

    public class Row implements Comparable<Row>{        //same as K Closest Points to Origin (Q-973)
        int soldiers;       
        int index;

        public Row(int soldiers , int index){
            this.soldiers = soldiers;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2){           //if same amount of soliers then compare the index otherwisw
            if(this.soldiers == r2.soldiers){       //return with the count of the soldiers
                return this.index - r2.index;
            }else{
                return this.soldiers - r2.soldiers;
            }
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<Row> pq = new PriorityQueue<>();
        int [] ans = new int[k];

        for(int i=0;i<mat.length;i++){
            int is_soldier_count = 0;       //to check whether the soldier is present or not
            for(int j=0;j<mat[0].length;j++){
                is_soldier_count += mat[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(is_soldier_count , i));      //it will store in the form of count=>index
        }

        int i=0;
        while(k!=0){
            ans[i++] = pq.remove().index;   //.index to store the object's value not object address
            k--;
        }
        return ans;
    }
}