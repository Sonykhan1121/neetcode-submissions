class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
    int ans =0;
    int start=0;
    int n = s.length();
    for(int i= 0;i<n;i++)
    {
        if(mp.containsKey(s.charAt(i)))
        {
            int lastOccurence = mp.get(s.charAt(i));
            for(int j = start;j<(lastOccurence+1);j++)
            {
                mp.remove(s.charAt(j));
            }
            start = lastOccurence+1;


            mp.put(s.charAt(i),i);
        }
        else
        {
            ans = Math.max(ans,i-start+1);
            mp.put(s.charAt(i),i);

        }
    }


        return ans;

    }
}
