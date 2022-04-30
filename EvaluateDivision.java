package solved;
import java.util.*;
public class EvaluateDivision {

	   public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
	        int n=equations.size();
	        Map<String,Map<String,Double>> map=new HashMap<>();
	        for(int i=0;i<equations.size();i++){
	            List<String> list=equations.get(i);
	            if(map.get(list.get(0))==null) map.put(list.get(0),new HashMap<>());
	            if(map.get(list.get(1))==null) map.put(list.get(1),new HashMap<>());
	            map.get(list.get(0)).put(list.get(1),values[i]);
	            map.get(list.get(1)).put(list.get(0),1/values[i]);
	        }
	        double[] ans=new double[queries.size()];
	        for(int i=0;i<queries.size();i++){
	            List<String> temp=queries.get(i);
	            if(map.get(temp.get(0))==null || map.get(temp.get(1))==null){
	                ans[i]=-1.0;
	            }
	            else ans[i]=find(map,temp.get(0),temp.get(1),1,new HashSet<>());
	        }
	        return ans;
	    }
	    public double find(Map<String,Map<String,Double>> map,String from,String to,double val,Set<String> set){
	        if(map.get(from).containsKey(to)) return val*map.get(from).get(to);
	        set.add(from);
	        for(String s:map.get(from).keySet()){
	            if(set.contains(s)) continue;
	            double v=find(map,s,to,val*map.get(from).get(s),set);
	            if(v!=-1.0) return v;
	        }
	        return -1.0;
	    }
}
