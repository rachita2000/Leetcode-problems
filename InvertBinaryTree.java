package solved;

public class InvertBinaryTree {

public TreeNode invertTree(TreeNode root) {
        
        if(root==null) return null;
        TreeNode tmp1=root.left;
        TreeNode tmp2=root.right;
        root.left=tmp2;
        root.right=tmp1;
        invertTree(root.left);
        invertTree(root.right);
        return root;
        
    }
}
