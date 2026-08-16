class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];

        prefix[0] = nums[0];
        for(int i =1;i<n;i++)
        {
            prefix[i] = nums[i]*prefix[i-1];
            
        }
        suffix[n-1] = nums[n-1];
        for(int j =n-2;j>=0;j--)
        {
            suffix[j] = nums[j] *suffix[j+1];
        }

        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));

        int res[] = new int[n];
        for(int i =0;i<n;i++)
        {
            int leftside =1;
            int rightside =1;
            
            if(i-1>=0)
            {
                leftside= prefix[i-1];
            }

            if(i+1<n)
            {
                rightside = suffix[i+1];
            }

            res[i] = leftside*rightside;


        }
        return res;

    }
}  
