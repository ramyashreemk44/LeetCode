class Solution {
    public int maxProfit(int[] prices) {
        int minval=Integer.MAX_VALUE;
        int maxval=0;
        for (int i =0;i<prices.length;i++){
            if (prices[i]<minval){
                minval=prices[i];
            }
            else if (prices[i]-minval>maxval){
                maxval=prices[i]-minval;
            }
            }
        

        return maxval;
    }
}