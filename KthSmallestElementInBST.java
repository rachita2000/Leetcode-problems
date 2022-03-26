package solved;
import java.util.*;
public class KthSmallestElementInBST {

	public int kthSmallest(TreeNode root, int k) {
        if(root==null) return -1;
        
        ArrayList<Integer> ar=new ArrayList<>();
        kthSmallest(root, ar);
        
        return ar.get(k-1);
        
    }
    
    private void kthSmallest(TreeNode root,  ArrayList<Integer> ar) {
        if(root==null) return;
        kthSmallest(root.left, ar);
        ar.add(root.val);
        kthSmallest(root.right, ar);
    }
}
