package solved;

public class ClimbingStairs {

	 public int climbStairs(int n) {
	        if(n==0) return 1;
	        int a=0, b=1;
	        int c=0;
	        for(int i=0;i<n;i++)
	        {
	            c=a+b;
	            a=b;
	            b=c;
	        }
	        return c;
	    }
}
