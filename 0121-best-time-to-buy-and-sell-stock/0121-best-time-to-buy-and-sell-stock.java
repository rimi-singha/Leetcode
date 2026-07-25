class Solution {
    public int maxProfit(int[] prices) {
         int mincost=prices[0];
         int profit =0;
        for(int i=1;i<prices.length;i++){
            if(mincost>=prices[i]){
             mincost=prices[i];
    }
      else{
        int todaysprofit=prices[i]-mincost;
        if(todaysprofit>profit){
            profit=todaysprofit;
        }
      }
        }
        return profit;
}
}