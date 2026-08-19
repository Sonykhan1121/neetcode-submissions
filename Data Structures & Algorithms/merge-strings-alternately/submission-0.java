class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergedOne = "";

        int i =0;
        int firstLength = word1.length();
        int j =0;
        int secondLength = word2.length();
        int k = 0;
        while(i<firstLength && j < secondLength)
        {

            if(k%2==0)
            {
            
                mergedOne+=word1.charAt(i);
                i++;
            }
            else
            {
                mergedOne+=word2.charAt(j);
                j++;
            }
            k++;
            
            
        }
        if(i<word1.length())
        {
                mergedOne+=word1.substring(i);
        }
        else if(j<word2.length())
        {
                mergedOne+=word2.substring(j);
        }


        return mergedOne;
    }
}