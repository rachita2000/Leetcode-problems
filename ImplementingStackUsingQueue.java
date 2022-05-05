package solved;
 import java.util.*;
 
 class MyStack {

	    Queue<Integer> q1;
	    public MyStack() {
	        q1=new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        q1.add(x);
	        int si=q1.size();
	        for(int i=0;i<si-1;i++)
	        {
	            q1.add(q1.remove());
	        }
	    }
	    
	    public int pop() {
	      return  q1.poll();
	    }
	    
	    public int top() {
	        return q1.peek();
	    }
	    
	    public boolean empty() {
	        return q1.isEmpty();
	    }
	}
public class ImplementingStackUsingQueue {
}
