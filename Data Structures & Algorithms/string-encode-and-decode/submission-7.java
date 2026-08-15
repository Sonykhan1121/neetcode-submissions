class Solution {

    public String encode(List<String> strs) {
        String encoded = "";

        int len = strs.size();

        int i =0;
        while(i<len)
        {
            encoded+=""+strs.get(i).length()+",";
            i++;
        }
        encoded+="#";
         i =0;
        while(i<len)
        {
            encoded+=""+strs.get(i);
            i++;
        }
        // System.out.println(encoded);

        return encoded;
    }

    public List<String> decode(String str) {
        
        int firstIndexOfHash = str.indexOf('#');
        String firstPart = str.substring(0,firstIndexOfHash);
        List<String> numbers = Arrays.asList(firstPart.split(","));
        String lastPart = str.substring(firstIndexOfHash+1);
        // System.out.println(firstPart);
        // System.out.println(lastPart);
        System.out.println(numbers.toString());

        List<String> ans = new ArrayList<>();
        if(numbers.size()==0)
        {
            return ans;
        }
        System.out.println("Numbers : "+numbers.toString());

        for(int i =0;i<numbers.size();i++)
        {
            if(numbers.get(i)=="")
            {
                // System.out.println("InputException : "+numbers.get(i)+" index : "+i);
               
                continue;
            }
            int val = Integer.parseInt(numbers.get(i));
            ans.add(lastPart.substring(0,val));
            lastPart = lastPart.substring(val);

        }





        return ans;
    }
}
