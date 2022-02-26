package solved;

public class MaximumProductSubarray {

	  public int maxProduct(int[] nums) {
	        int ans=nums[0];
	        for(int i=0;i<nums.length;i++)
	        {
	            int pro=nums[i];
	            for(int j=i+1;j<nums.length;j++)
	            {
	                ans=Math.max(pro, ans);
	                pro*=nums[j];
	            }
	            ans=Math.max(pro,ans);
	        }
	        return ans;
	    }
}
