package solved;
import java.util.*;
public class MaxNumberOfK_SumPairs {

	 public int maxOperations(int[] nums, int k) {
         Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int r=k-nums[i];
            
            //check if that k-nums[i] present and had some value left or already paired
            if(map.containsKey(r) && map.get(r)>0){
                count++;
                map.put(r,map.get(r)-1);
                
            }else{
                if(map.containsKey(nums[i])){
                      map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }
        }
        return count;
    }
}
