class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles; //initially full
        while(numBottles>=numExchange){
             count += numBottles / numExchange; // after drinking (all bottles are empty)
             numBottles =(numBottles / numExchange)+(numBottles % numExchange); // empty + full 
        }
        return count;
    }
}