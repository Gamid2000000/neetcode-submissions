class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int answer = 0;

            while(right<prices.length){
                if(prices[left]<prices[right]){
                    int prafit = prices[right]-prices[left];
                    answer = Math.max(answer,prafit);
                }
                else{
                    left = right;
                }
                right++;
            }  
        return answer;    
    }
}
