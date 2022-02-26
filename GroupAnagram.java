package solved;
import java.util.*;
public class GroupAnagram {

	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<Map<Character, Integer>,List<String>> ans=new HashMap<>();
		for(String s: strs)
		{
			char ch[]=s.toCharArray();
			HashMap<Character, Integer> map=new HashMap<>();
			for(char c:ch)
				map.put(c, map.getOrDefault(c, 0)+1);
			if(ans.containsKey(map))
			{
				List<String> tmp=ans.get(map);
				tmp.add(s);
				ans.put(map,tmp);
			}
			else 
			{
				List<String> tmp=new ArrayList<>();
				tmp.add(s);
				ans.put(map,tmp);
			}
		}
		return new ArrayList<>(ans.values());
	 }
	public static void main(String[] args) {
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(str));
	}
}
