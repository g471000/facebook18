package _010BuySellStock;

public class Solution{
    public static void main(String[] args){
      System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
      System.out.println(maxProfit(new int[]{5, 4, 3, 2, 1}));
      System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }   
  
    public static int maxProfit(int[] prices){
      if(prices == null || prices.length < 2){
        return 0;
      }
      int min = prices[0];
      int maxProfit = 0;
      for(int i = 1; i < prices.length; i++){
        min = Math.min(prices[i], min);
        maxProfit = Math.max((prices[i] - min), maxProfit);
      }
      
      return maxProfit;
    }
}