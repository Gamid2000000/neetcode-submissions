class Solution {
    public int maxProfit(int[] p) {
      int ans = 0;

      for(int i = 0;i<p.length;i++){
        for(int j = i+1;j<p.length;j++){
         ans = Math.max(ans, p[j] - p[i]);
        }
      }
      return ans;
    }
}
