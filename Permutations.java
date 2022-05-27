package solved;
import java.util.*;
public class Permutations {

	 public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> ans=new ArrayList<>();
	        helper(nums, new ArrayList<>(), ans);
	        return ans;
	    }
	    
	    private void helper(int[] nums, List<Integer> list, List<List<Integer>> ans)
	    {
	        if(nums.length==list.size())
	        {
	            ans.add(new ArrayList<>(list));
	            return;
	        }
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            if(list.contains(nums[i]))
	                continue;
	            list.add(nums[i]);
	            helper(nums, list, ans);
	            list.remove(list.size()-1);
	        }
	    }
}
