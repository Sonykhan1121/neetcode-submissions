class Solution {
    public int[] topKFrequent(int[] nums, int limit) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int res[] = new int[limit];

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        // System.out.println(map.toString());

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i =0;i<1001;i++)
        {
            ar.add(new ArrayList<>());
        }
        
        // for(int i =0;i<nums.length;i++)
        // {
        //     int count = map.get(nums[i]);

        //     ar.get(count).add(nums[i]);
        // }
        for(int val : map.keySet())
        {
            ar.get(map.get(val)).add(val);
        }

        // System.out.println(ar.toString());
        

        int k =0;
        for(int i =1000;i>=0;i--)
        {
            if(ar.get(i).size()>0&&k<limit)
            {
                
                for(int j =0;j<ar.get(i).size()&&k<limit;j++)
                {
                    res[k++] =  ar.get(i).get(j);
                    
                }
                
            }
        }
        
        return res;
    }
}
