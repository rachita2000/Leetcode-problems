package solved;
import java.util.*;
public class MyCalendar_I {

	class MyCalendar {
	    List<int[]>list;
	    public MyCalendar() {
	        list=new ArrayList<>();
	    }
	    
	    public boolean book(int start, int end) {
	        for(int i[]:list){
	            if(i[0]<end && start<i[1])
	                return false;
	        }
	        
	        int arr[]={start,end};
	        list.add(arr);
	        return true;
	    }
	}
}
