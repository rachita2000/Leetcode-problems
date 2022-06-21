package solved;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {

	 public int furthestBuilding(int[] heights, int bricks, int ladders) {
	        PriorityQueue<Integer>pq=new PriorityQueue<>((x,y)->y-x);
	        for(int i=0;i<heights.length-1;i++){
	            // If current height is higher, we don't have to use
	            // bricks or ladder.
	            if(heights[i]>=heights[i+1]){
	                continue;
	            }else{
	               // We have to use either brick or ladder.
	                
	                //required Bricks
	                int reqB=heights[i+1]-heights[i];
	                if(bricks>0 && bricks>=reqB){
	                    // Prefer bricks because we can later change from 
	                    // bricks to ladder as we will see below.
	                    bricks-=reqB;
	                   pq.add(reqB);
	                }
	                else if(ladders>0){// If even bricks are insufficient, check ladders.
	                    if(!pq.isEmpty() && pq.peek()>reqB){
	                        bricks+=pq.poll();
	                        pq.add(reqB);
	                        bricks-=reqB;
	                    }
	                    ladders--;
	                }
	                else
	                    return i;
	            }
	        }
	        return heights.length-1;
	    }
}
