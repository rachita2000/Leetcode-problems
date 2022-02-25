package solved;
import java.util.*;
public class ThreeSum {

	  public List<List<Integer>> threeSum(int[] nums) {
	     Set<List<Integer>> set=new HashSet<>();
	     Arrays.sort(nums);
	     for(int i=0;i<nums.length;i++)
	     {
	    	 int j=i+1, k=nums.length-1;
	    	 while(j<k)
	    	 {
	    		 List<Integer> tmp=new ArrayList<>();
	    		 int sum=nums[i]+nums[j]+nums[k];
	    		 if(sum==0)
	    		 {
	    			tmp.add(nums[i]);
	    			tmp.add(nums[j]);
	    			tmp.add(nums[k]);
	    			set.add(tmp);
	    			j++;k--;
	    		 }
	    		 else if(sum>0) k--;
	    		 else 
	    			 j++;
	    	 }
	    	 
	     }
	     return new ArrayList(set);
	    }
}
