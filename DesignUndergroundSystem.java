package solved;
import java.util.*;

class UndergroundSystem {

    class IdDetails{
        
        String station;
        int time;
        
        IdDetails(String station, int time)
        {
            this.station=station;
            this.time=time;
        }
    }
    
    HashMap<Integer, IdDetails> map;
    HashMap<String, int[] > avgmap;
    public UndergroundSystem() {
        map=new HashMap<>();
        avgmap=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map.put(id, new IdDetails(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        IdDetails cur= map.get(id);
        
        String staname=cur.station+"|"+stationName;
        int totaltime=t-cur.time;
        
        if(avgmap.containsKey(staname))
        {
            int[] ar=avgmap.get(staname);
            ar[0]+=totaltime;
            ar[1]++;
        }
        else
        {
            int[] ar=new int[2];
            ar[0]=totaltime;
            ar[1]=1;
            avgmap.put(staname,ar);
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String station=startStation+"|"+endStation;
         int[] ar=avgmap.get(station);
        return (double)ar[0]/(double)ar[1];
    }
}

public class DesignUndergroundSystem {

}
