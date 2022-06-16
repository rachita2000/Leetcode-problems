package solved;
import java.util.*;
public class MaximumErasureValue {

	public int maximumUniqueSubarray(int[] nums) {
	       int max=Integer.MIN_VALUE;
	        int cursum=0;
	        int i=0, j=0;
	        HashSet<Integer> set=new HashSet<>();
	        while(j<nums.length)
	        {
	            if(!set.contains(nums[j]))
	            {
	                set.add(nums[j]);
	                cursum+=nums[j];
	                max=Math.max(max, cursum);
	               
	            }
	            else
	            {
	                 while(nums[i]!=nums[j])
	                {
	                    cursum-=nums[i];
	                    set.remove(nums[i]);
	                    i++;
	                }
	                i++;
	            }
	            j++;
	        }
	        
	        return max;
	    }
}
