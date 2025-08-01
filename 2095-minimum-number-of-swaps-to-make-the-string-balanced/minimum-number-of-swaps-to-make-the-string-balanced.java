class Solution {
    public int minSwaps(String s) {
        int open=0,close=0,min_swaps=0,imbalance=0;

        for(int i=0;i<s.length();i++){  //iterate over string to count brackets
            if(s.charAt(i) == '['){
                open++;
            }
            else{
                close++;
            }
            imbalance = close-open; //claculate the extra closing brackets which
            if(imbalance>0){    //leads to imbalance and swap the brackets
                min_swaps++;
                open++;
                close--;
            }

        }
        return min_swaps;
    }
}