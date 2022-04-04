package solved;

public class HouseRobberII {

	 public int rob(int[] nums) {
	        if(nums.length==1)
	            return nums[0];
	        if(nums.length==2)
	            return Math.max(nums[0], nums[1]);
	        
	        int [] tmp=nums.clone();
	        
	        tmp[1]=Math.max(nums[0], nums[1]);
	        
	        int max1=0; //will store the max by skipping the last house
	        for(int i=2;i<nums.length-1;i++)
	            tmp[i]=Math.max(tmp[i]+tmp[i-2], tmp[i-1]);
	        
	        max1=tmp[nums.length-2];
	        
	        int max2=0;//will store the max by skipping the first house
	        
	        nums[2]=Math.max(nums[1], nums[2]);
	        for(int i=3;i<nums.length;i++)
	            nums[i]=Math.max(nums[i]+nums[i-2], nums[i-1]);
	        
	        max2=nums[nums.length-1];
	        
	        return Math.max(max1, max2);
	    }
}
