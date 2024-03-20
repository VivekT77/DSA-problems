//logic=> first mark the 1st day price as buy price then iterate over the prices if the current price is greater than the buy price means profit is there ,calculate the profit and update the latest price as a buy price to proceed further with the updated value 
class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(buy_price < prices[i]){
                profit = profit + prices[i]-buy_price;      
            }
            buy_price = prices[i];
        }
        return profit;
    }
}