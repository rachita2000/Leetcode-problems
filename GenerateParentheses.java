package solved;
import java.util.*;
public class GenerateParentheses {

	 public List<String> generateParenthesis(int n) {
	        int open=n, close=n;
	        String s="";
	        List<String> result=new ArrayList<>();
	        helper(open, close, s, result);
	        return result;
	    }
	    private void helper( int open , int close, String s, List<String> res)
	    {
	        if(open==0 && close==0)
	        {
	            res.add(s);
	            return;
	        }
	        
	        if(open!=0)
	            helper(open-1, close, s+"(" , res);
	        if(open < close)
	            helper(open, close-1, s+")" , res);
	    }
}
