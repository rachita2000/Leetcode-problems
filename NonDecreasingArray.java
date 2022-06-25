package solved;

public class NonDecreasingArray {

	//Optimised
	public boolean checkPossibilityO(int[] nums) {
        boolean ans=true;
        int modification=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
               modification++;
            }
            if(i-2>=0 && i+1<n){
                if(nums[i-2]>nums[i] && nums[i-1]>nums[i+1])
                    return false;
            }
            if(modification>1)
                return false;
        }
        return true;
    }
	//Better
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
