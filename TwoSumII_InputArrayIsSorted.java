package solved;

public class TwoSumII_InputArrayIsSorted {

	 public int[] twoSum(int[] nums, int target) {
	        int[] ans=new int[2];
	        int i=1, j=nums.length;
	        while(i<j)
	        {
	            if(nums[i-1]+nums[j-1]== target)
	            {
	                ans[0]=i;
	                ans[1]=j;
	                return ans;
	            }
	            else if(nums[i-1]+nums[j-1] > target)
	                j--;
	            else
	                i++;
	        }
	        
	        return ans;
	    }
}
