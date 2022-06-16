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
    
    
    // 2 Approach
    public String longestPalindrome2(String s) {
        if(s.length()<=1) return s;   
    
        int maxLength=1;
        int startingPoint=0;
       // using odd and even length method  
       for(int i=1;i<s.length();i++){
           //for even
           int left=i-1;
           int right=i;
           while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            if(maxLength<right-left+1){
            maxLength=right-left+1;
            startingPoint=left;
            }
            left--;
            right++;
           }
           //for odd
           left=i-1;
           right=i+1;
           while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            if(maxLength<right-left+1){
            maxLength=right-left+1;
            startingPoint=left;
            }
            left--;
            right++;
           }
           
       }
       
       return s.substring(startingPoint,maxLength+startingPoint);
    }
}
