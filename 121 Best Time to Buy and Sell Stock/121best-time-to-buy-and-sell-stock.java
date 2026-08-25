class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);

            int profit=prices[i]-min;

            if(profit>maxprofit){
                maxprofit=profit;
            }   
        }
        return maxprofit;
        
    }
        

   
}