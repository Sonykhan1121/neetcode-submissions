class Solution {
    public int[] sortArray(int[] nums) {

        int start =0;
        int end = nums.length -1;
        mergeSort(nums,0,end);

        return nums;
        
    }

    public static void mergeSort(int [] nums,int start ,int end)
    {

        
        if(start<end)
        {
            int mid = start+(end-start)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
        

    }
    public static void merge(int[] nums,int start ,int mid ,int end)
    {
        int temp[] = new int[end-start+1];

        int k =0;
        int i = start;
        int j = mid+1;
        while(i<=mid&&j<=end)
        {
            if(nums[i]<=nums[j])
            {
                temp[k] = nums[i];
                i++;
            }
            else if(nums[j]<nums[i])
            {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }
        while(i<=mid)
        {
            temp[k++] = nums[i++];
        }

        while(j<=end)
        {
            temp[k++] = nums[j++];
        }
        i =0;
        for(i=0;i<end-start+1;i++)
        {
            nums[start+i] = temp[i];
        }

    }
}