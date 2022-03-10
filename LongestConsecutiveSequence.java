package solved;
import java.util.*;
public class LongestConsecutiveSequence {

	 public int longestConsecutive(int[] nums) {
		 Set<Integer> set=new HashSet<>();
	        for(int i:nums)
	            set.add(i);
	        int finalCount=0;
	        for(int i:nums)
	        {
	        	if(!set.contains(i-1))
	        	{
	        		int num=i;
	        		int count=0;
	        		while(set.contains(num))
	        		{
	        			num+=1;
	        			count++;
	        		}
	        		
	        		finalCount=Math.max(finalCount, count);
	        	}
	        }
	        return finalCount;
	    }
}
