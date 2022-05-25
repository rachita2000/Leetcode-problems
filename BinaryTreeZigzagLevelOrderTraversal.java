package solved;
import java.util.*;
public class BinaryTreeZigzagLevelOrderTraversal {

	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        Queue<TreeNode> queue=new LinkedList<>();
	        int flag=0;
	        List<List<Integer>> res=new ArrayList<>();
	        queue.add(root);
	        
	        while(!queue.isEmpty())
	        {
	            int size=queue.size();
	            List<Integer> list=new ArrayList<>();
	            for(int i=0;i<size;i++)
	            {
	                TreeNode node=queue.poll();
	                if(node!=null)
	                {
	                    list.add(node.val);
	                    queue.add(node.left);
	                    queue.add(node.right);
	                }
	            }
	            
	            if(!list.isEmpty())
	            {
	                if(flag %2 ==1)
	                    Collections.reverse(list);
	                
	                res.add(list);
	            }
	            
	            flag++;
	        }
	        
	        return res;
	    }
}
