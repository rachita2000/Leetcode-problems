package solved;
import java.util.*;
public class Top_K_Frequent_Words {

	public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>((a, b)->map.get(a)-map.get(b)==0?b.compareTo(a):map.get(a)-map.get(b));
        
        for (String key: map.keySet()) {
            pq.offer(key);
            if (pq.size()>k) 
                pq.poll();
        }
        
        LinkedList<String> res = new LinkedList<>();
        
        while (!pq.isEmpty()) {
            res.add(0, pq.poll());
        }
        
        return res;
    }
}
