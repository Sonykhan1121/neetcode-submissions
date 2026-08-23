class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length-1;

        int ans = 0;
        while(left < right)
        {
            int minSide = Math.min(heights[right],heights[left]);
            int now = (right-left)*minSide;
            ans = Math.max(ans,now);
            
            if(heights[right]==minSide)
            {
                right--;
            }
            else
            {
                left++;
            }

        }

        return ans;
    }
}
