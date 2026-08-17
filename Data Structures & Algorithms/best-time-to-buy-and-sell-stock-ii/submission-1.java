class Solution {
    public int maxProfit(int[] prices) {
      
        int n = prices.length;
        int dp[][] = new int[n+1][2];

        dp[n][0] = dp[n][1] = 0;

        for(int i =n-1;i>=0;i--)
        {
            for(int holding=0;holding<=1;holding++)
            {
                int doNothing = dp[i+1][holding];

                int total ;

                if(holding==1)
                {
                    total = prices[i]+ dp[i+1][0];

                }
                else
                {
                    total = -prices[i] + dp[i+1][1];
               }


               dp[i][holding] = Math.max(doNothing,total);
            }
        }
        return dp[0][0];
    }

}