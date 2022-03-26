package solved;

import java.util.Stack;

public class LargestRectangleInHistogram {

	public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] preSmall=new int[n];
        int[] nextSmall=new int[n];
        
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
        	while(!s.isEmpty() && heights[s.peek()] >= heights[i])
        		s.pop();
        	
        	if(s.isEmpty())
        		preSmall[i]=-1;
        	else
        		preSmall[i]=s.peek();
        	
        	s.push(i);
        }
        
        s.clear();
        for(int i=n-1;i>=0;i--)
        {
        	while(!s.isEmpty() && heights[s.peek()] >= heights[i])
        		s.pop();
        	
        	if(s.isEmpty())
        		nextSmall[i]=n;
        	else
        		nextSmall[i]=s.peek();
        	
        	s.push(i);
        }
        
        int result=0;
        for(int i=0;i<n;i++)
        {
        	result=Math.max(result, (nextSmall[i]-preSmall[i]-1) * heights[i]);
        }
        return result;
    }
    
  
}
