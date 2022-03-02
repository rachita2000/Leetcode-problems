package solved;
import java.util.*;
public class TopKFrequentElements {

	public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        	s.put(nums[i] , s.getOrDefault(nums[i], 0)+1);
        PriorityQueue<Integer> pq= new PriorityQueue((a,b)->s.get(b) -s.get(a));
        for(int i: s.keySet())
        pq.add(i);
        int ind=0;
        while(ind<k)
        	ans[ind++]=pq.poll();
        	return ans;
    }
}
