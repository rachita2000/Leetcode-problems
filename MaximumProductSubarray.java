package solved;

public class MaximumProductSubarray {

	// Approach O(N)
	public int maxProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE;
        int currProd=1;
        for(int i=0;i<nums.length;i++)
        {
            currProd*=nums[i];
            
            maxProd=Math.max(maxProd, currProd);
            
            if(currProd==0)
                currProd=1;
        }
        
        currProd=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            currProd*=nums[i];
            
            maxProd=Math.max(maxProd, currProd);
            
            if(currProd==0)
                currProd=1;
        }
        
        return maxProd;
    }
	// Approach O(N^2)
	  public int maxProduct1(int[] nums) {
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
