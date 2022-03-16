package solved;

import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i] ,i);
        }
        
        return buildTree(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1, map);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder, int istart, int iend, int pstart, int pend, HashMap<Integer, Integer> map ) {
        
        if(istart>iend || pstart>pend) return  null;
        int rootdata=postorder[pend];
        TreeNode root=new TreeNode(rootdata);
        int inroot=map.get(rootdata);
        int numsleft=inroot-istart;
        
        root.left=buildTree(inorder, postorder, istart, inroot-1, pstart, pstart+numsleft-1, map);
        root.right=buildTree(inorder, postorder, inroot+1, iend, pstart+numsleft, pend-1, map);
        
        return root;
    }
}
