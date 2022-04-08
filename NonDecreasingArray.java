package solved;

public class NonDecreasingArray {

	public boolean checkPossibility(int[] nums) {
        if(nums.length==1) return true;
        
        int errorIdx=error(nums);
        if(errorIdx==-1)
            return true;
        
        int errorValue=nums[errorIdx];
        nums[errorIdx]=nums[errorIdx+1];
        if(error(nums)==-1) 
            return true;
        
        nums[errorIdx]=errorValue;
        nums[errorIdx+1]=errorValue;
        if(error(nums)==-1)
            return true;
        
        return false; 
    }
    
    private int error(int[] num)
    {
        for(int i=0;i<num.length-1;i++)
        {
            if(num[i]>num[i+1])
                return i;
        }
        
        return -1;
    }
}
