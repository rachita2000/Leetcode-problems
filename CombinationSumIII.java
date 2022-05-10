package solved;
import java.util.*;
public class CombinationSumIII {

	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new LinkedList<>();
        helper(1, k , n, new LinkedList<Integer>(), result);
        return result;
    }
    
    private void helper(int start, int k, int n, LinkedList<Integer> tmp, List<List<Integer>> result)
    {
        if(tmp.size()==k && n==0)
        {
            result.add(new LinkedList<>(tmp));
            return;
        }
        
        for(int i=start; i<=9;i++)
        {
            tmp.add(i);
            helper(i+1, k, n-i, tmp, result);
            tmp.removeLast();
        }
    }
}
