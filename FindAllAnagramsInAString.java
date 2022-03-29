package solved;
import java.util.*;
public class FindAllAnagramsInAString {

	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
        	String tmp=s.substring(i, i+p.length());
        	if(anagram(p, tmp))
        		ans.add(i);
        }
        
        return ans;
    }
    
    private boolean anagram(String s, String p)
    {
    	int arr[] = new int[26];
        for(int i=0;i<p.length();i++)
        {
            arr[s.charAt(i)-'a']++;
            arr[p.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }
        }
       return true;
    }
}
