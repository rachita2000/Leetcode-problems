package solved;

public class ShortestUnsortedContinuousSubarray {

	public int findUnsortedSubarray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        while(low< nums.length-1 && nums[low] <= nums[low+1])
            low++;
        
        if(low==nums.length-1)
            return 0;
        while(high>0 && nums[high] >= nums[high-1])
            high--;
        
        int minSub=Integer.MAX_VALUE;
        int maxSub=Integer.MIN_VALUE;
        for(int i=low;i<=high;i++)
        {
            minSub=Math.min(minSub, nums[i]);
            maxSub=Math.max(maxSub, nums[i]);
        }
        
        while(low>0 && nums[low-1] > minSub )
            low--;
        
        while(high<nums.length-1 && nums[high+1] < maxSub )
            high++;
        
        return high-low+1;
    }
}
