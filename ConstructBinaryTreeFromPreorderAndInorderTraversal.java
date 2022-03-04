package solved;
import java.util.*;
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i], i);
        
        return buildTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1, map);
    }
    
    private TreeNode buildTree(int[] preorder, int[] inorder, int pstart, int pend, int istart, int iend, HashMap<Integer, Integer> map) {
     
        if(pstart>pend || istart>iend) return null;
        
        TreeNode root=new TreeNode(preorder[pstart]);
        int rootIninorder=map.get(root.val);
        int numsLeft=rootIninorder-istart;
        
        root.left=buildTree(preorder, inorder, pstart+1, pstart+numsLeft, istart, rootIninorder-1, map);
        root.right=buildTree(preorder, inorder, pstart+numsLeft+1, pend, rootIninorder+1, iend, map);
        return root;
    }
}
