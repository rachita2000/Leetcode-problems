package solved;

public class WateringPlants {

	 public int wateringPlants(int[] plants, int capacity) {
	        if(plants.length==1) return 1;
	        int ans=0;
	        int c=capacity;
	        for(int i=0;i<plants.length;i++)
	        {
	            if(plants[i] > c)
	            {
	                c=capacity;
	                ans=ans+i+i;
	               // System.out.println(ans+" "+ i);
	            }
	            c=c-plants[i];
	            ans++;
	           // System.out.println("Sec "+ans+" "+ i);
	        }
	        return ans;
	    }
}
