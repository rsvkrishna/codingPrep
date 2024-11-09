package Blind75.arrays;

public class LC121BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max =0;
        int profit =0;
        for(int i =0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}
