class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int bestB=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<bestB){
                bestB=prices[i];
            }
            else if((prices[i]-bestB)>max){
                max= prices[i]-bestB;
            }
        }
        return max;
    }
}