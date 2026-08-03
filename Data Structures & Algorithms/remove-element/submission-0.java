class Solution {
    public int removeElement(int[] nums, int val) {
        int finalArrayIndex =0;
        int i =0;
        int n = nums.length;
        while(i<n)
        {
            if(nums[i]!=val)
            {
                swap(nums,finalArrayIndex,i);
                finalArrayIndex++;
            }
            else
            {
                nums[i] = 0;
            }


            i++;
        }
        return finalArrayIndex;
    }
    public static void swap(int[] nums,int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}