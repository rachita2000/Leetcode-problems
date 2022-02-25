package solved;
import java.util.*;
public class MinStack {

	 int min=Integer.MAX_VALUE;
	    Stack<Integer> s, mins;
	    
	    public MinStack() {
	        s=new Stack<>();
	        mins=new Stack<>();
	    }
	    
	    public void push(int val) {
	        if(min> val)
	            min=val;
	        mins.push(min);
	        s.push(val);
	    }
	    
	    public void pop() {
	        s.pop();
	        mins.pop();
	        if(!mins.isEmpty())
	            min=mins.peek();
	        else
	            min=Integer.MAX_VALUE;
	    }
	    
	    public int top() {
	        return s.peek();
	    }
	    
	    public int getMin() {
	        return mins.peek();
	    }
}
