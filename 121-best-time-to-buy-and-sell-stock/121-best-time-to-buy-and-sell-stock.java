class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int buy=prices[0];
        int current_profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(buy>prices[i]){
                buy=prices[i];
            }            
            else
            { 
                current_profit=prices[i]-buy;
             if (profit<current_profit){
                 profit = current_profit;
             }
            }
        }
        return profit;

    }
}