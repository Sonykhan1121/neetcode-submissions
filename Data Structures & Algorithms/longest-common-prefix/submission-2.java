class Solution {
    public String longestCommonPrefix(String[] s) {
        String ans = "";
        int minColumn = Integer.MAX_VALUE;

        int n = s.length;
        for(int i =0;i<n;i++)
        {
            minColumn = Math.min(minColumn,s[i].length());
        }

        int low = 0;
        int high  = minColumn-1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;

                            if(checkThisSectionMatchedOrNot(s,low,mid))
            {
                    low = mid+1;
            }
            else
            {
                high = mid-1;
            }


        }



        String tempAns = s[0].substring(0,high+1);

        return (tempAns.isEmpty())?ans:tempAns;
    }
    public static boolean checkThisSectionMatchedOrNot(String s[],int low, int mid )
    {
            String temp = s[0].substring(low,mid+1);

            int n = s.length;
            for(int i =0;i<n;i++)
            {
                String afterCut = s[i].substring(low,mid+1);
                if(!afterCut.equals(temp))
                {
                    return false;
                }
            }


            return true;
    }
}