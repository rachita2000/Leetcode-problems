package solved;
import java.util.*;
public class SubstringWithConcatenationOfAllWords {

	public List<Integer> findSubstring(String s, String[] words) {
		if(s.length()==0 || s==null || words.length==0 || words==null)
        	return new ArrayList<>();
        
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        	map.put(words[i], map.getOrDefault(words[i], 0)+1);
        
        int totalwords=words.length;
        int eachwordlength=words[0].length();
        
        List<Integer> res=new ArrayList<>();
        
        for(int i=0;i<=s.length()-(totalwords*eachwordlength);i++) {
        	
        	HashMap<String, Integer> wordseen=new HashMap<>();
        	for(int j=0;j<totalwords;j++)
        	{
        		int startindex=i+(j*eachwordlength);
        		String word=s.substring(startindex, startindex+eachwordlength);
        		if(!map.containsKey(word))
        			break;
        		
        		wordseen.put(word, wordseen.getOrDefault(word, 0)+1);
        		
        		if(wordseen.get(word) > map.get(word))
        			break;
        		
        		if((j+1) == totalwords)
        			res.add(i);
        	}
        }
        
        return res;
    }
}
