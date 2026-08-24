class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int suffix[] = new int[n];
       

        for(int i =n-1;i>=0;i--)
        {
            if(i==n-1)
            {
                suffix[i] = prices[i];
            }
            else 
            {
                suffix[i] = Math.max(suffix[i+1],prices[i]);
            }
        }
        int ans =0;
        for(int i =0;i<n-1;i++)
        {
            int current = suffix[i+1] - prices[i];
            ans = Math.max(ans,current);
        }


        return ans;
    }
}
