class Solution {
    public void sortColors(int[] nums) {
        int zeroIndex = 0;
        int twoIndex = nums.length-1;

        int n =nums.length;
        int i =0;
        while(i<=twoIndex)
        {
            if(nums[i]==0)
            {
                swap(nums,i,zeroIndex);
                zeroIndex++;
                i++;
            }
            else if(nums[i]==2)
            {
                swap(nums,i,twoIndex);
                twoIndex--;
                
            }else
            {
                 i++;
            }

        //    System.out.println(zeroIndex+","+i+","+twoIndex);
        //    System.out.println(Arrays.toString(nums));
        }
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}