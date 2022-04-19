package solved;

public class RecoverBinarySearchTree {

	private TreeNode prev=null;
    private TreeNode first=null;
    private TreeNode middle=null;
    private TreeNode last=null;
    public void recoverTree(TreeNode root) {
        if(root==null ) return;
        first=prev=middle=last=null;
        
        inorderHelper(root);
        
        if(first!=null && last!=null) //if two swapped nodes are not adjacent
        {
            int tmp=first.val;
            first.val=last.val;
            last.val=tmp;
        }
        else if(first!=null && middle!=null) //if two swapped nodes are adjacent
        {
            int tmp=first.val;
            first.val=middle.val;
            middle.val=tmp;
        }
    }
    
    private void inorderHelper(TreeNode root)
    {
        if(root==null) return;
        
        inorderHelper(root.left);
        
        if(prev!=null && prev.val > root.val)
        {
            if(first==null)
            {
                first=prev;
                middle=root;
            }
            else
                last=root;
        }
        
        prev=root;
        
        inorderHelper(root.right);
    }
}
