public class BestTimeToBuyStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
            else{
                // calculating the currProfit
                int currProfit=prices[i]-buyPrice;
                // calculate the maxProfit
                maxProfit=Math.max(currProfit,maxProfit);
            }
        }
        System.out.println(maxProfit);
    }    
}