package solved;

public class Candy {

	 public int candy(int[] ratings) {
	        int n=ratings.length;
	        if(n==1)
	            return 1;
	        int[] dp=new int[n];
	        if(ratings[0] <= ratings[1])
	            dp[0]=1;
	        else 
	            dp[0]=2;
	        for(int i=1;i<n;i++)
	        {
	            if(ratings[i]>ratings[i-1])
	                dp[i]=dp[i-1]+1;
	            else
	                dp[i]=1;
	        }
	        
	        for(int i=n-2;i>=0;i--)
	        {
	            if(ratings[i]>ratings[i+1] && dp[i]<=dp[i+1])
	                dp[i]=dp[i+1]+1;
	        }
	        int sum=0;
	        for(int i: dp)
	            sum+=i;
	        return sum;
	    }
}
