class BestTimeToSell {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for(Integer p:prices){
            if(p<min){
                min = p;
            }

            else if(profit<p-min){
                profit=p-min;
            }
        }
        return profit;
    }
}