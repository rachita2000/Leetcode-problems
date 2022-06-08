package solved;

public class JumpGameII {

	 public int jump(int[] nums) {
	        int n=nums.length;
	        int step=0 , left=0, right=0;
	        
	        while(right < n-1)
	        {
	            int max=0;
	            //find max in between left-right
	            for(int i=left;i<=right;i++)
	                max=Math.max(nums[i]+i  ,  max);
	            
	            // update the boundaries
	            left=right+1;
	            right=max;
	            step++;
	        }
	        
	        return step;
	    }
}
