package solved;

public class LinkedListInBinaryTree {

	public boolean isSubPath(ListNode head, TreeNode root) {
        if(head==null) return true;
        if(root==null) return false;
        
        boolean check=helper(head, root);
        
        if(root!=null && !check)
            return isSubPath(head, root.left) || isSubPath(head, root.right);
        
        return check;
    }
    private boolean helper(ListNode head, TreeNode root) {
        if(head==null) return true;
        if(root==null) return false;
        
        if(head.val==root.val)
            return helper(head.next, root.left) || helper(head.next, root.right);
        
        return false;
    }
}
