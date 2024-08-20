class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
    // 1st approach = O(nlogn)
        Arrays.sort(asteroids);
        long m = mass;

        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=m){
                m += asteroids[i];
            }else{
                return false;
            }
            if(mass > 100000){
                return true;
            }

        }
        return true;

    // //  2nd approach = O(N)   
    //     Stack<Integer> s = new Stack<>();  //in 1st approch we sort  so to reduce TC used stack
    //     long m = mass;

    //     for( int asteroid : asteroids){
    //         s.push(asteroid);

    //         while(!s.isEmpty() && s.peek() <= m){   //compare the top element with the given mass and 
    //             m += s.pop();     //update the mass and at last if stack is empty then true otherwise false
    //         }
    //     }
    //     return s.isEmpty();
    }
}