package solved;
import java.util.*;
public class FourSum {

	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>ans=new LinkedList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                long t=target-(long)(nums[i]+nums[j]);
                
                int si=j+1;
                int ei=n-1;
                
                while(si<ei){
                    long currSum=nums[si]+nums[ei];
                    if(currSum==t){
                        List<Integer>res=new LinkedList<>();
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[si]);
                        res.add(nums[ei]);
                
                         if(ans.contains(res)==false){
                             ans.add(res);
                         }
                        si++;
                        ei--;
                    }
                    else if(currSum>t){
                        ei--;
                    }
                    else if(currSum<t){
                        si++;
                    }
                }
                
            }
           
        }
        return ans;
    }
}
