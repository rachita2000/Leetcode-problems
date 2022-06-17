package solved;

public class NextPermutation {

	 public void nextPermutation(int[] nums) {
	        int n=nums.length;
	        int ind1=-1;
	        for(int i=n-2;i>=0;i--)
	        {
	            if(nums[i]<nums[i+1])
	            {
	                ind1=i;
	                break;
	            }
	        }
	        
	        if(ind1!=-1)
	        {
	            int ind2=-1;
	            for(int i=n-1;i>=0;i--)
	            {
	                if(nums[ind1]<nums[i])
	                {
	                    ind2=i;
	                    break;
	                }
	            }
	            
	            swap(nums, ind1, ind2);
	        }
	        
	        int i=ind1+1;
	        int j=n-1;
	        reverse(nums, i, j);
	    }
	    
	    private void swap(int[] nums, int i, int j)
	    {
	        int tmp=nums[i];
	        nums[i]=nums[j];
	        nums[j]=tmp;
	    }
	    
	    private void reverse(int[] nums, int i , int j)
	    {
	        while(i<j)
	        {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }
}
