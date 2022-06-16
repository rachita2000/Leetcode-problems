package solved;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
	        int count=0;
	        int ans=0;
	        for(int i=0; i<s.length();i++)
	        {
	        	
	            if(map.containsKey(s.charAt(i)))
	            {
	            	
	            	i=(map.get(s.charAt(i)));
	            	
	                count=0;
	                map.clear();
	            }
	            else{
	            map.put(s.charAt(i), i);
	                count++;
	            }
	            if(count>ans)
	                ans=count;
	        }
	        return ans;
   }
}
