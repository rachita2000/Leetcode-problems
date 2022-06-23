package solved;
import java.util.*;
public class CourseScheduleIII {

	public int scheduleCourse(int[][] arr) {
        // max heap to track the max duration courses
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
         // sort courses by last day in ascending order
        Arrays.sort(arr, (a,b)-> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]);
        int time=0;
        for(int i=0;i<arr.length;i++){
            //if duration is <= lastDay
            if(arr[i][0]<=arr[i][1]){
                //if current course taken then total time
                int temp=time+arr[i][0];
                //if temp is <= current course lastDay
                if(temp<=arr[i][1]){
                    //add current course duration in time
                    time+=arr[i][0];
                    //add current course duration in queue
                    pq.add(arr[i][0]);
                }else{
                //Check if the top element in queue is greater than the current current course duration
                    if(!pq.isEmpty() && pq.peek()>arr[i][0]){
                        //remove the max duration from queue
                        int top=pq.poll();
                        //eleminate top from time taken 
                        time-=top;
                        //add current course duration in queue
                        pq.add(arr[i][0]);
                         //add current course duration in time
                        time+=arr[i][0];
                    }
                }
            }
        }
        return pq.size();
    }
}
