package solved;
import java.util.*;
public class Subsets {

	 public List<List<Integer>> subsets(int[] nums) {
	        List<List<Integer>> res=new ArrayList<>();
	        
	        Arrays.sort(nums);
	        helper(nums, 0, new ArrayList<>(), res);
	        
	        return res;
	    }
	    
	
	private void helper(int[] nums, int i, List<Integer> tmp, List<List<Integer>> res) {
		
		res.add(new ArrayList<>(tmp));
		
		for(int k=i;k<nums.length;k++)
		{
			tmp.add(nums[k]);
			helper(nums, k+1, tmp, res);
			tmp.remove(tmp.size()-1);
		}
		
	}
	
}
