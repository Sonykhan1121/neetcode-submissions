class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n) k = k%n;

        rotate(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
        rotate(nums,0,k-1);
        System.out.println(Arrays.toString(nums));
        rotate(nums,k, n-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int nums[],int start,int end)
    {
        while(start<end)
        {
             swap(nums,start,end);
            start++;
            end--;
           
        }
    }
    public static void swap(int nums[], int i ,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}