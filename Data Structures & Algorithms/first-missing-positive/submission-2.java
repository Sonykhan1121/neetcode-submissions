class Solution {
    public int firstMissingPositive(int[] nums) {
        int n  = nums.length;

        for(int i =0;i<n;i++)
        {
            // System.out.println("Value "+nums[i]+" i : "+i);
            if(nums[i]>=1&&nums[i]<=n&&nums[i]!=i+1)
            {
                // System.out.println("Found mismatch , value : "+nums[i]+" , index : "+(i+1));
                int lastleft = -1;
                int lastright = -2;
                while(nums[i]>0&&nums[i]!=i+1&&nums[i]<=n)
                {
                    swap(nums,i,nums[i]-1);

                    if(lastleft==i&&lastright==nums[i]-1)
                    {
                        break;
                    }
                    lastleft = i;
                    lastright = nums[i]-1;

                    // System.out.println("Swapping happen between ("+i+" , "+(nums[i]-1)+")");
                }
            }
            // System.out.println("Found match , value : "+nums[i]+" , index : "+(i+1));1111111
        }

        int missingNumber  =n+1;

        for(int i =0;i<n ; i++)
        {
            if(nums[i]!=i+1)
            {
                missingNumber = i+1;
                break;
            }
        }

        return missingNumber;


    }

    public static void swap(int nums[], int i ,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}