package solved;
import java.util.*;
public class PathSumII {

	 List<List<Integer>> ans=new ArrayList<>();
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        
	        ArrayList<Integer> list=new ArrayList<>();
	        pathSum(root, targetSum, list);
	        
	        return ans;
	    }
	    
	    private void pathSum(TreeNode root, int targetSum, ArrayList<Integer> list){
	        
	        if(root==null)
	            return;
	        
	        list.add(root.val);
	        if(root.left==null && root.right==null && root.val==targetSum)
	            ans.add(list);
	        else
	        {
	            pathSum(root.left, targetSum-root.val, new ArrayList(list));
	            
	            pathSum(root.right, targetSum-root.val, new ArrayList(list));
	        }
	    }
}
