package solved;
import java.util.*;
public class QueueReconstructionByHeight {

	 public int[][] reconstructQueue(int[][] people) {
	        List<int[] > list=new ArrayList<>(people.length);
	        
	        Arrays.sort(people, (a,b)-> a[0]==b[0] ? a[1]-b[1] : b[0]-a[0]);
	        
	        for(int i=0;i<people.length;i++)
	        {
	            list.add(people[i][1] , people[i]);
	           
	        }
	        
	        return list.toArray(new int[people.length][2]);
	    }
}
