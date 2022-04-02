package solved;
import java.util.*;
public class FindAndReplacePattern {

	public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> ans=new ArrayList<>();
        
        for(String s:words)
        {
            if(helper(s, pattern))
                ans.add(s);
        }
        
        return ans;
    }
    
    private boolean helper(String a, String b)
    {
        for(int i=0;i<a.length();i++)
        {
            if(a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i)))
                return false;
        }
        
        return true;
    }
}
