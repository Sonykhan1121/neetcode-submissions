class Solution {
    public int longestConsecutive(int[] a) {
        HashSet<Integer> st = new HashSet<>();
        int ans =0;
        int n = a.length;

        boolean visited[] = new boolean[n];

    
        for(int i =0;i<n;i++)
        {
            st.add(a[i]);
        }

        for(int i =0;i<n;i++)
        {
            if(!st.contains(a[i]-1))
            {
                int start =a[i];
                int nowCount =1;

                    while(st.contains(start+1))
                    {
                        start++;
                        nowCount++;

                    }
                    ans = Math.max(ans,nowCount);
            }
            
            
        }






        return ans;


    }
}
