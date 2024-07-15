class Solution {
    public boolean judgeSquareSum(int c) {
        // long a = 0,b = (long)Math.sqrt(c);
        // while(a<=b){
        //     if(a*a + b*b==c){
        //         return true;
        //     }else if(a*a + b*b>c){
        //         b--;
        //     }else{
        //         a++;
        //     }
        // }
        // return false;
        Set<Integer> s = new HashSet<>();
        int high = (int)Math.sqrt(c);  

        for(int i=0;i<=high;i++){   //till i reaches high,add all the squares lower than it
            s.add(i*i);
        }
        for(int i=0;i<=high;i++){  //now if the remaining part of the sum is present in set  
            int low = c-(i*i);          //then true or false
            if(s.contains(low)){
                return true;
            }
        }
        return false;
    }
}