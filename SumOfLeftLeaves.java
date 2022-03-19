package solved;

public class SumOfLeftLeaves {

	public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) 
            return 0;
        
        // checking if left node is leaf node
        if(root.left!=null && root.left.left==null && root.left.right==null)
            return root.left.val + sumOfLeftLeaves(root.right);
        
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
