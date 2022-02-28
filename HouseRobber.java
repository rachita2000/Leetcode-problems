package solved;

public class HouseRobber {

	public int rob(int[] nums) {
	       int[] dp=new int[nums.length];
	        dp[0]=nums[0];
	        if(nums.length==1) return nums[0];
	        int i=1;
	        dp[i]=Math.max(dp[i-1],nums[i]);
	        i++;
	        while(i<nums.length)
	        {
	            dp[i]= Math.max(dp[i-1], nums[i]+dp[i-2]);
	            i++;
	        }
	        return dp[nums.length-1];
	           
	    }
}
