class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int lastIndexOfAnsArray = m+n-1;
        while(i>=0&&j>=0)
        {
            if(nums1[i]>=nums2[j])
            {
                nums1[lastIndexOfAnsArray] = nums1[i];
                i--;

            }
            else if(nums2[j]>=nums1[i])
            {
                nums1[lastIndexOfAnsArray] = nums2[j];
                j--;
            }

            lastIndexOfAnsArray--;
        }
        // System.out.print("i :"+i+" , j : "+j+" last index : "+lastIndexOfAnsArray);
        while(i>=0)
        {
            nums1[lastIndexOfAnsArray--] = nums1[i--];
            
        }

        while(j>=0)
        {
            nums1[lastIndexOfAnsArray--] = nums2[j--];
          
        }

    }


}