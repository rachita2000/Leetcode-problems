package solved;

import java.util.Arrays;

public class SearchInRotatedSortedArrayII {

	public boolean search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        int n=nums.length;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            int val=nums[mid];
            if(val==target || target==nums[h] || target== nums[l])
                return true;
            
            if(nums[h]== nums[l])
            {
                h--;
                continue;
            }
            
            if(val<=nums[h])
            {
                if(val<=target && target<=nums[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
            else
            {
                if(nums[l]<=target && target<=val)
                    h=mid-1;
                else
                    l=mid+1;
            }
        }
        return false;
	}
}
