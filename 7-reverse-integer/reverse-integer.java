class Solution {
    public int reverse(int x) {
        int ans = 0; 

        while (x != 0) { 
            int last = x % 10; 
            int newResult = ans * 10 + last; // Calculate the reversed integer by adding the last digit
         // to the current result after multiplying it by 10
            if ((newResult - last) / 10 != ans) { // Check for overflow by reversing the process and
                                                     // comparing with the previous result
                return 0; 
            }
            ans = newResult; 
            x = x / 10; 
        }

        return ans;
    }
}