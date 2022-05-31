package solved;
import java.util.*;
public class Check_If_A_StringContainsAllBinaryCodesOfSize_K {

	public boolean hasAllCodes(String s, int k) {
        HashMap<String, Integer> map=new HashMap<>();
        for(int i=0;i<s.length()-k+1;i++)
        {
            String c=s.substring(i, k+i);
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        //System.out.println(map.size());
        int codes=(int)(Math.pow(2, k));
        if(map.size()>=codes)
            return true;
        else
            return false;
    }
}
