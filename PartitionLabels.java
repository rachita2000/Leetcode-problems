package solved;
import java.util.*;
public class PartitionLabels {

	public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
        	map.put(s.charAt(i), i);
        }
        List<Integer> res=new ArrayList<>();
        int pre=-1;
        int max=0;
        
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	max=Math.max(max, map.get(c));
        	if(max==i)
        	{
        		res.add(max-pre);
        		pre=max;
        	}
        }
        
        return res;
    }
}
