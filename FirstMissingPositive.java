package solved;

public class FirstMissingPositive {

	 public int firstMissingPositive(int[] nums) {
	        int ones=0;
	        for(int i:nums)
	        {
	            if(i==1)
	            {
	                ones++;
	                break;
	            }
	        }
	        if(ones==0)
	            return 1;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]<1 || nums[i]>nums.length)
	                nums[i]=1;
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	            int a=Math.abs(nums[i]);
	            if(a==nums.length) 
	                nums[0]=-Math.abs(nums[0]);
	            else 
	                nums[a]=-Math.abs(nums[a]);
	        }
	        for(int i=1;i<nums.length;i++)
	        {
	            if(nums[i]>0) return i;
	        }
	        if(nums[0]>0)
	            return nums.length;
	        
	        return nums.length+1;
	    }
}
