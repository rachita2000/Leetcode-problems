package solved;
import java.util.*;
public class ShortEncodingOfWords {

public int minimumLengthEncoding(String[] words) {
        
        Set<String>s1=new HashSet<>();
        Set<String>s2=new HashSet<>();
        
        for(String s:words){
            s1.add(s);
            s2.add(s);
        }
        
        for(String s:s1){
            
            String curr=s;
            
            for(int j=0;j<curr.length();j++){
                String subString=curr.substring(j+1);
                if(s2.contains(subString)){
                    s2.remove(subString);
                }
            }
        }
        
        int ans=0;
        
        for(String s:s2){
            ans+=s.length();
        }
        
        return ans+s2.size();
    }
}
