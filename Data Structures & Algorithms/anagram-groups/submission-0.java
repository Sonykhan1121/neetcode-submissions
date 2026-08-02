class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = s.length;
        for(int i =0;i<n;i++)
        {
            String generatedString = CountString(s[i]);

            map.putIfAbsent(generatedString,new ArrayList<>());
            map.get(generatedString).add(s[i]);
        }

        return new ArrayList<>(map.values());
    }

    public static String CountString(String s)
    {
        String ans = "#";
        int letter[] = new int[26];

        for(int i =0;i<s.length();i++)
        {
            letter[s.charAt(i)-'a']++;
        }


        for(int i =0;i<26;i++)
        {
                ans+=letter[i];
                ans+="#";
        }


        return ans;

    }
}
