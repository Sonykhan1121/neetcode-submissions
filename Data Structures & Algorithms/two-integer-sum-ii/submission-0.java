class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int n = numbers.length;
        int ans[] = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++)
        {

            int remain = target - numbers[i];

            if(map.containsKey(remain))
            {
                ans[0] = map.get(remain)+1;
                ans[1] = i+1;
                return ans;
            }


            map.put(numbers[i],i);

        }



        return ans;

    }
}
