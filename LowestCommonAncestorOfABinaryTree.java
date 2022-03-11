package solved;

public class LowestCommonAncestorOfABinaryTree {

	   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null) return root;
	        if(root == p || root==q) return root;
	        TreeNode a=lowestCommonAncestor(root.left, p , q);
	        TreeNode b=lowestCommonAncestor(root.right, p , q);
	        if(a==null)
	            return b;
	        if(b==null)
	            return a;
	        return root;
	    }
}
