class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sumCount= new HashMap<>();
        int total = 0;
        int n= nums.length;
        int prefix = 0;
        sumCount.put(0,1);
        for(int i =0;i<n;i++)
        {
            prefix+=nums[i];
            // System.out.println("index : "+i);
            int remain = prefix -k;
            // System.out.println("prefix : "+prefix+" , k : "+k+" , remain : "+remain);
            // System.out.println(" sumCount.get( "+remain+") : "+sumCount.get(remain));
            if(sumCount.containsKey(remain))
            {
                total+=sumCount.get(remain);
            }

            // System.out.println("total : "+total);
            
           

            sumCount.put(prefix,sumCount.getOrDefault(prefix,0)+1);
        }




        return total;

    }
}