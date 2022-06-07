package solved;
import java.util.*;
public class CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res=new ArrayList<>();
		helper(candidates, res, new ArrayList<>(), 0, target);
		return res;
    }
	
	private void helper(int[] c,List<List<Integer>> res, List<Integer> tmp, int st, int target)
	{
		if(target <0) return;
		if(target==0)
		{
			res.add(new ArrayList<>(tmp));
			return;
		}
		
		for(int i=st;i<c.length;i++)
		{
			tmp.add(c[i]);
			helper(c, res, tmp, i, target-c[i]);
			tmp.remove(tmp.size()-1);
		}
	}
}
