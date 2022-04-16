package solved;

public class ConvertBST_ToGreaterTree {

	 public TreeNode convertBST(TreeNode root) {
	       helper(root, 0);
	        return root;
	    }
	    
	    private int helper(TreeNode root, int curSum){
	        if(root==null) return curSum;
	        
	        int rightSum=helper(root.right, curSum);
	        rightSum+=root.val;
	        
	        root.val=rightSum;
	        
	        int leftSum=helper(root.left , rightSum);
	        
	        return leftSum;
	    }
}
