package solved;

public class SymmetricTree {

	 public boolean isSymmetric(TreeNode root) {
	        if(root==null) return true;
	       return sym(root.left, root.right);
	    }
	     
	    private boolean sym(TreeNode r1, TreeNode r2){
	    
	        if(r1== null && r2==null) return true;
	        if((r1!=null && r2==null) || (r1==null && r2!=null)) return false;
	        if(r1.val != r2.val) return false;
	        
	        return sym(r1.left, r2.right) && sym(r1.right, r2.left);
	    }
}
