package solved;
import java.util.*;
public class ThreeSumWithMultiplicity {

	public int threeSumMulti(int[] arr, int target) {
        long count=0;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++)
        {
            HashMap<Integer, Integer> map=new HashMap<>();
            int nt=target-arr[i];
            int j=i+1, k=arr.length;
            while(j<k)
            {
                if(map.containsKey(nt-arr[j]))
                {
                    count+=map.get(nt-arr[j]);
                }
                if(map.containsKey(arr[j]))
                    map.put(arr[j], map.get(arr[j])+1);
                else
                    map.put(arr[j],1);
                j++;
            }
        }
        
        return (int)(count%mod);
        
    }
}
