package solved;

public class IncreasingOrderSearchTree {

	TreeNode result=new TreeNode(-1);
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        TreeNode res=result;
        inorder(root);
        return res.right;
    }
    
    private void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        result.right=new TreeNode(root.val);
        result=result.right;
        inorder(root.right);
    }
}
