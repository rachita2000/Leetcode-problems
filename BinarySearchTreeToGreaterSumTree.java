package solved;

public class BinarySearchTreeToGreaterSumTree {

	public TreeNode bstToGst(TreeNode root) {
        if(root==null) return root;
        
         helper(root, 0);
        return root;
    }
    
    private int helper(TreeNode root, int sum)
    {
        if(root==null) return 0;
        int right=helper(root.right, sum);
        int rootdata=root.val;
        root.val=rootdata+right+sum;
        int left=helper(root.left, root.val);
        
        return rootdata+right+left;
    }
}
