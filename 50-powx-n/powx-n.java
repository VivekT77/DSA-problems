//recursion
//logic=> if the n is even then x^(n/2) + x^(n/2)...like 2^10 = 2^5 + 2^5
// if the n is odd then x + x^(n/2) + x^(n/2)...like 2^7 = 2 + 2^3 + 2^3
class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if (n < 0) {
            return 1 / (x * myPow(x, -n-1 ));
        }
        if(n%2==0){
            return myPow(x*x,n/2);
        }
        return x * myPow(x*x,(n-1)/2);
    }
}