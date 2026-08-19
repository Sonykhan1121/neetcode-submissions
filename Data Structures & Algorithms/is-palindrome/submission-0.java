class Solution {
    public boolean isPalindrome(String s) {
      int i = 0;
      s = s.toLowerCase();
      int j = s.length() -1;
      int n = s.length();

      while(i<j)
      {
        
        while(i<n&&!characterOrDigit(s.charAt(i)))
        {
            i++;
        }
        while(j>=0&&!characterOrDigit(s.charAt(j)))
        {
            j--;
        }
        if(i==j||i>j)
        {
            break;
        }

        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        i++;
        j--;

      }

      return true;

    }

    public boolean characterOrDigit(char c)
    {
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9');
    }
    
}
