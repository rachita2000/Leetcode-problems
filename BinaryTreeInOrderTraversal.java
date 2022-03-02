package solved;
import java.util.*;
public class BinaryTreeInOrderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
	    if(root==null)
	        return new ArrayList<>();
	    List<Integer> ans = new ArrayList<>();
	        
	    return helper(root, ans);
	}
	public List<Integer> helper(TreeNode root, List<Integer> ans) {
	    if(root==null)
	        return new ArrayList<>();
	    helper(root.left, ans);
	    ans.add(root.val);
	    helper(root.right, ans);
	    return ans;
	}
}
