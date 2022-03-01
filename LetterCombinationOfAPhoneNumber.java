package solved;
import java.util.*;
public class LetterCombinationOfAPhoneNumber {

	public static List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
        	List<String> tmp= new ArrayList<>();
        	return tmp;
        }
        
        return combinations(digits);
    }

    private static List<String> combinations(String digits) {
        if(digits.length()==0)
        {
        	List<String> tmp= new ArrayList<>();
        	tmp.add("");
        	return tmp;
        }
        char ch=digits.charAt(0);
        //System.out.println(ch);
        List<String> sans=combinations(digits.substring(1));
        String c= helper(ch-'0');
        List<String> ans=new ArrayList<>();
        for(int i=0;i<sans.size();i++)
        {
        	for(int j=0;j<c.length();j++)
        	{	
        		String a=c.charAt(j)+sans.get(i);
        		ans.add(a);
        	}
        }
        return ans;
    }
	private static String helper(int n)
	{
		String ch="";
		if(n==2)
			ch="abc";
		else if(n==3)
			ch="def";
		else if(n==4)
			ch="ghi";
		else if(n==5)
			ch="jkl";
		else if(n==6)
			ch="mno";
		else if(n==7)
			ch="pqrs";
		else if(n==8)
			ch="tuv";
		else if(n==9)
			ch="wxyz";
		return ch;
	}
		
		public static void main(String[] args) {
			System.out.println(letterCombinations("23"));
		}
		
}
