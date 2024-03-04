//logic=> iterate through the array if the ith number is less than the k value ,it means the no. 
//has taken place in the sequence of the missing no.s so increase the value of 'k' at last print the
// value of updated k
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}