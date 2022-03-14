package solved;

public class DeleteNodeInaBST {

	public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key)
        {
            if(root.left==null && root.right==null) return null;
            else if(root.left!=null && root.right==null) return root.left;
            else if(root.left==null && root.right!=null) return root.right;
            else
            {
                TreeNode rightmin=root.right;
                while(rightmin.left!=null)
                    rightmin=rightmin.left;
                
                root.val=rightmin.val;
                root.right=deleteNode(root.right, rightmin.val);
                return root;
            }
        }
        else if(root.val>key)
            root.left=deleteNode(root.left, key);
        else
            root.right=deleteNode(root.right, key);
        return root;
    }
}
