class Solution {

     public class Point implements Comparable<Point>{
         int arr[];     //to store points in array and look like 2D array
         int distsq;   //distance between two points

         Point(int arr[],int distsq){  //called constructor
            this.arr = arr;
            this.distsq = distsq;
         }

        @Override    //to access the compareTo method from comparable interface we need to override
        public int compareTo(Point p2){
            return this.distsq - p2.distsq;   //from origin to the point
         }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq =new PriorityQueue<>();  //to get distance in the priority order
        int ans[][] = new int[k][2];        
        for(int p[] : points){
            int distsq = (int)(Math.pow(p[0],2) + Math.pow(p[1],2));
            pq.add(new Point(p, distsq));       //add the point with its respective distance
        }

        int i=0;
        while(k!=0){    
            ans[i++]=pq.remove().arr;     //pop the required points from the priority queue where
            k--;                        //the distance will be in increasing order
        }
        return ans;

    }
}