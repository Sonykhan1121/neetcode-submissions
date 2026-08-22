class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        int n = nums.length;
        int j =0;

        while(i<n)
        {
            while(i+1<n&& nums[i]==nums[i+1])
            {
                i++;
            }
            nums[j] = nums[i];

            i++;
            j++;

        }

        return j;
    }
}