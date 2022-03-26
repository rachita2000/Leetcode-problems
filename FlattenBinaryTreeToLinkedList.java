package solved;

public class FlattenBinaryTreeToLinkedList {

	public void flatten(TreeNode root) {
        TreeNode tmp;
        if(root==null ||(root.left==null && root.right==null))
            return;
        
        while(root!=null)
        {
            if(root.left==null)
                root=root.right;
            
            else
            {
                tmp=root.left;
                while(tmp.right!=null)
                    tmp=tmp.right;
                
                tmp.right=root.right;
                root.right=root.left;
                root.left=null;
                root=root.right;
            }
        }
    }
}
