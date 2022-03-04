package solved;
import java.util.*;
public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        return levelOrder(root, ans);
    }
    private List<List<Integer>> levelOrder(TreeNode root,  List<List<Integer>> ans) {
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> tmp=new ArrayList<>();
        tmp.add(root.val);
        ans.add(tmp);
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> tmp1=new ArrayList<>();
            while(size!=0)
            {
                TreeNode front=q.poll();
                
                if(front.left!=null)
                {
                    tmp1.add(front.left.val);
                    q.add(front.left);
                }
                 if(front.right!=null)
                {
                    tmp1.add(front.right.val);
                    q.add(front.right);
                }
                
                
                size--;
            }
            if(!tmp1.isEmpty()){
                ans.add(tmp1);
                }
        }
        return ans;
    }
}
