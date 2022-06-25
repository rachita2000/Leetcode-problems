package solved;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {

	
	//Optimised
	public int lengthOfLongestSubstringO(String s) {
        if(s.length()==1)
            return 1;
        
       HashMap<Character,Integer>map=new HashMap<>();
        int maxLen=0;
        
        int i=0;
        int j=0;
        
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                i=Math.max(map.get(ch)+1,i);
            }
            map.put(ch,j);
            int currLen=j-i+1;
            maxLen=Math.max(maxLen,currLen);
            j++;
        }
        return maxLen;
    }
	
	
	
	//Better
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
