package solved;
import java.util.*;
public class ShortestSubarrayWithSumAtLeastK {

	public int shortestSubarray(int[] A, int K) {

	    int n = A.length;
	    int len = n+1;
	    
	    long[] prefixSum = new long[n+1];
	    prefixSum[0] = 0;
	    
	    
	    for(int i = 1; i<n+1; i++)
	        prefixSum[i] = (long)A[i-1]+prefixSum[i-1];
	    
	    Deque<Integer> dq = new ArrayDeque<>();
	   
	    
	    for(int i = 0; i<n+1; i++){
	                     
	        while(!dq.isEmpty() && prefixSum[i] - prefixSum[dq.peekFirst()] >= K){
	            len = Math.min(len, i-dq.peekFirst());
	            dq.pollFirst();
	        }
	        
	        while(!dq.isEmpty() && prefixSum[i] <= prefixSum[dq.peekLast()]){
	            dq.pollLast();
	        }
	            
	        dq.offer(i);
	    }
	    
	        
	    return len <=n ? len :-1 ;
	}
}
