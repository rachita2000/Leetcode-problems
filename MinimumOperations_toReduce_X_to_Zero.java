package solved;
import java.util.*;
public class MinimumOperations_toReduce_X_to_Zero {

	 public int minOperations(int[] nums, int x) {
	        int target=0;
	        for(int i=0;i<nums.length;i++){
	            target+=nums[i];
	        }
	        target-=x;
	        
	        if(target==0)
	            return nums.length;
	 
	        //To store the prefix sum
	        Map<Integer,Integer>map=new HashMap<>();
	        int preSum=0;
	        int result=-1;
	        map.put(preSum,-1);
	        for(int i=0;i<nums.length;i++){
	            preSum+=nums[i];
	            if(map.containsKey(preSum-target)){
	                result=Math.max(result,i-map.get(preSum-target));
	            }
	            map.put(preSum,i);
	        }
	        if(result==-1)
	            return -1;
	        
	        return nums.length-result;
	    }
}
