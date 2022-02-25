package solved;

public class MoveZeros {

	 public void moveZeroes(int[] nums) {
	        if(nums.length<=1) return ;
	        int n=nums.length;
	        int i=0, j=0;
	    while(i<n && j<n)
	    {
	        if(nums[i]!=0)
	        {
	            int tmp=nums[i];
	            nums[i]=nums[j];
	            nums[j]=tmp;
	            j++;
	        }
	        i++;
	    }
	        
	    }
}
