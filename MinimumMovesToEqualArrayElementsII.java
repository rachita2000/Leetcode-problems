package solved;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {

	 public int minMoves2(int[] nums) {
	        Arrays.sort(nums);
	        int si=0;
	        int ei=nums.length-1;
	        int mid=(ei+si)/2;
	        int midElement=nums[mid];
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            count+=Math.abs(midElement-nums[i]);
	        }
	        return count;
	    }
}
