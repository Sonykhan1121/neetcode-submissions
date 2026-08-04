class Solution {
    public int majorityElement(int[] nums)  {
        int n = nums.length;
        int halfSize = n/2;
        int ans = -1;
        int countMax =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            int count =map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],count);
            if(countMax<count)
            {
                countMax = count;
                ans = nums[i];
            }
        }

        return ans;


    }
}