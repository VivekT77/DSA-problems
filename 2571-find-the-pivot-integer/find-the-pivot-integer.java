class Solution {
    public int pivotInteger(int n) {
        int start=1,end=n;
        int total=n*(n+1)/2;
        while(start<=end){
            int mid= start+ (end-start)/2;
            int firsthalfsum = mid*(mid+1)/2;
            int nexthalfsum = total-firsthalfsum +mid ;
            if(firsthalfsum==nexthalfsum){
                return mid;
            }else if(firsthalfsum<nexthalfsum){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}