package solved;
import java.util.*;
public class PopulatingNextRightPointersInEachNode {

	 public Node connect(Node root) {
	        if(root==null) return null;
	        Queue<Node> que=new LinkedList<>();
	        
	        que.add(root);
	        while(!que.isEmpty())
	        {
	            int size=que.size();
	            
	            for(int i=0;i<size;i++)
	            {
	                Node tmp=que.poll();
	                if(i==size-1)
	                    tmp.next=null;
	                else
	                    tmp.next=que.peek();
	                
	                if(tmp.left!=null)
	                    que.add(tmp.left);
	                if(tmp.right!=null)
	                    que.add(tmp.right);
	                    
	            }
	        }
	        
	        return root;
	    }
}
