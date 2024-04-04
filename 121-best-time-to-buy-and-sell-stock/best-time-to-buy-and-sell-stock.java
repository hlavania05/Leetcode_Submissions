class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = Integer.MAX_VALUE;
        int profit = 0;
        int max_profit = 0;
        for(int i=0; i<prices.length; i++){
            buy_price = Math.min(buy_price, prices[i]);
            if(prices[i] >= buy_price){
                profit = prices[i] - buy_price;
            }
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }
}