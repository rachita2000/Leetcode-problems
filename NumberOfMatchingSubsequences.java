package solved;
import java.util.*;
public class NumberOfMatchingSubsequences {

	public int numMatchingSubseq(String s, String[] words) {
        Map<String,Integer>map=new HashMap<>();
        for(String st:words){
            if(map.containsKey(st)){
                map.put(st,map.get(st)+1);
            }else{
                map.put(st,1);
            }
        }
        int ans=0;
        for(String st:map.keySet()){
            int i=0;
            int j=0;
            
            while(i<s.length() && j<st.length()){
                if(s.charAt(i)==st.charAt(j)){
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            }
            if(j==st.length()){
                ans+=map.get(st);
            }
        }
        return ans;
    }
}
