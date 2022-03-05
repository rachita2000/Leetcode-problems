package solved;
import java.util.*;
public class SubarraySumEqualsK {

	public int subarraySum(int[] nums, int k) {
        
        if(nums.length==0)
            return 0;
      HashMap<Integer, Integer> map=new HashMap<>();
        int curSum=0 , count=0;
        for(int i=0;i<nums.length;i++)
        {
            curSum+=nums[i];
            if(curSum==k)
                count+=1;
            if(map.containsKey(curSum-k))
                count+=map.get(curSum-k);
            map.put(curSum, map.getOrDefault(curSum, 0)+1);
        }
        return count;
    }
}
