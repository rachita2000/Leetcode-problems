package solved;

public class WiggleSubsequence {

	 public int wiggleMaxLength(int[] nums) {
	        if(nums.length<=1) return 1;
	        int count=1;
	        int preDif=0;
	        for(int i=0;i<nums.length-1;i++)
	        {
	            int dif=nums[i+1]-nums[i];
	            if(dif<0 && preDif >=0 || dif>0 && preDif<=0 )
	            {
	                count++;
	                preDif=dif;
	            }
	        }
	        
	        return count;
	    }
}
