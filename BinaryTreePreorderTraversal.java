package solved;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        helper(root, list);
        return list;
    }
    
    private void helper(TreeNode root, ArrayList<Integer> list)
    {
        if(root==null) return;
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}
