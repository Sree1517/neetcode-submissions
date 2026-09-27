class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(prices[i],buy);
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}
