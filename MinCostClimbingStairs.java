package solved;
import java.util.*;
public class MinCostClimbingStairs {

	
	//DP
	
	 public int minCostClimbingStairsDP(int[] cost) {
	        int []dp=new int[cost.length+1];
	        dp[0]=0;
	        dp[1]=0;
	        for(int i=2;i<dp.length;i++)
	        {
	         dp[i]=Math.min(cost[i-1]+dp[i-1], cost[i-2]+dp[i-2]);   
	        }
	        
	        return dp[dp.length-1];
	    }
	//Memorization
	 public int minCostClimbingStairs(int[] cost) {
	        int []memo=new int[cost.length+1];
	        Arrays.fill(memo, -1);
	       int op1= helper(cost, cost.length-1, memo);
	        int op2=helper(cost,cost.length-2, memo);
	        return Math.min(op1, op2);
	    }
	    
	    private int helper(int[] cost , int ind, int[] memo)
	    {
	        if(ind==0 || ind==1)
	        {
	            memo[ind]=cost[ind];
	            return cost[ind];
	        }
	        if(memo[ind]!=-1)
	            return memo[ind];
	        int op1=cost[ind]+Math.min(helper(cost, ind-1,memo), helper(cost, ind-2,memo));
	        memo[ind]=op1;
	        return op1;
	    }
}
