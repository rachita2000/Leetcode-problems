package solved;
import java.util.*;
public class FindTheDuplicateNumber {

	 public int findDuplicate(int[] arr) {
	        Map<Integer,Integer> map=new HashMap<>();
	         for(int i:arr)
		    	   map.put(i, map.getOrDefault(i, 0)+1);
		       for(int i:arr)
		       {
		    	   if(map.get(i)>1)
		    		  return i;
		       }
	        return -1;
	    }
}
