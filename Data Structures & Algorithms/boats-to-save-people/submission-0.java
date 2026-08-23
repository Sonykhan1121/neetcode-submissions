class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left =0;
        int right = people.length-1;

        int totalBoat = 0;
        while(left<=right)
        {
            if(left==right)
            {
                totalBoat++;
                    break;

            }

            else if(limit>=people[right]+people[left])
            {
                totalBoat++;
                left++;
                right--;

            }
            else 
            {
                totalBoat++;
                right--;
            }
        }


        return totalBoat;

    }
}