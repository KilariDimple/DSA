class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];   // minimum buying price
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            // if current price is lower, update low
            if (prices[i] < low) {
                low = prices[i];
            }
            // calculate profit
            else {
                int temp = prices[i] - low;
                if (temp > profit) {
                    profit = temp;
                }
            }
        }
        return profit;
    }
}
