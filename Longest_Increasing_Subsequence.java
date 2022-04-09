package solved;

public class Longest_Increasing_Subsequence {

	 public int lengthOfLIS(int[] nums) {
	        int n=nums.length;
	        int tmp[]=new int[n];
	        int len=1;
	        tmp[0]=nums[0];
	        for(int i=1;i<n;i++)
	        {
	        	if(nums[i] > tmp[len-1])
	        	{
	        		tmp[len]=nums[i];
	        		len++;
	        	}
	        	else
	        	{
	        		int index=binarysearch(tmp, 0, len, nums[i]);
	        		tmp[index]=nums[i];
	        	}
	        }
	        return len;
	 }
	 
	 private int binarysearch(int[] n, int i, int j, int tar)
	 {
		 while(i<=j)
		 {
			 int mid=i+(j-i)/2;
			 if(n[mid]<tar)
				 i=mid+1;
			 else
				 j=mid-1;
		 }
		 
		 return i;
	 }
}
