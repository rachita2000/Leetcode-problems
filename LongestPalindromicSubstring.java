package solved;

public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
        if(s.length()==1) return s;
        String ans="";
        for(int i=0;i< s.length();i++)
        {
            for(int j=s.length()-1;j>i;j--)
            {
                String tmp=s.substring(i, j+1);
                if(tmp.length()>ans.length() && isPalindrome(tmp))
                { 
                    ans=tmp;
                     break;
                }
            }
        }
        return (ans.length()>0 )? ans :s.charAt(0)+"";
    }
    
    private boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(j>i)
        {
            if(s.charAt(i)!=s.charAt(j))
               return false;
               j--;
               i++;
        }
               return true;
    }
}
