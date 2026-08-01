class Solution {
    public String longestCommonPrefix(String[] s) {
        String ans = "";
        int minColumn = Integer.MAX_VALUE;

        int n = s.length;
        for(int i =0;i<n;i++)
        {
            minColumn = Math.min(minColumn,s[i].length());
        }

        for(int j =0;j<minColumn;j++)
        {
            char now = s[0].charAt(j);
            boolean possible = true;
            for(int i =0;i<n;i++)
            {
                if(now!=s[i].charAt(j))
                {
                    possible = false;
                    break;
                }
            }
            if(!possible)
            {
                break;
            }
            else
            {
                ans+=now;
            }
        }



        return ans;
    }
}