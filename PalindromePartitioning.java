package solved;
import java.util.*;
public class PalindromePartitioning {

	public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(ans, new ArrayList<>(), s);
        return ans;
    }
    
    private void helper(List<List<String>> ans, List<String> tmp, String s)
    {
        if(s.length()==0)
        {
            ans.add(new ArrayList<>(tmp));
            return ;
        }
        for(int i=0;i<s.length();i++)
        {
            if(isPalindrome(s.substring(0, i+1)))
            {
                tmp.add(s.substring(0, i+1));
                helper(ans, tmp, s.substring(i+1));
                tmp.remove(tmp.size()-1);
            }
        }
        
        
    }
    
    public boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))return false;
        }
        return true;
    }
}
