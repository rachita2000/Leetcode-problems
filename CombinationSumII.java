package solved;
import java.util.*;
public class CombinationSumII {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, res, new ArrayList<>());
        
        return res;
    }
    
    private void helper(int[] can, int target, int st, List<List<Integer>> res, List<Integer> tmp)
    {
        if(target<0) return;
        if(target==0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        
        for(int i=st;i<can.length;i++)
        {
            if(i>st && can[i]==can[i-1])
                continue;
            tmp.add(can[i]);
            helper(can, target-can[i], i+1, res, tmp);
            tmp.remove(tmp.size()-1);
            
        }
    }
}
