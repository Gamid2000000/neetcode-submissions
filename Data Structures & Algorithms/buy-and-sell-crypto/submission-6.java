class Solution {
    public int maxProfit(int[] p) {
      int min = Integer.MAX_VALUE;
      int max = 0;

      for(int price: p){
        min = Math.min(min, price);
        int profit = price - min;
        max = Math.max(max, profit);
      }
      return max;
    }
}
