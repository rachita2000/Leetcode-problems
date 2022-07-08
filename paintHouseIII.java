package solved;

public class paintHouseIII {

	//Memorization
	public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int memo[][][]=new int[m+1][n+1][m+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                for(int k=0;k<=m;k++){
                    memo[i][j][k]=-1;
                }
            }
        }
        
       int ans = solve(0,0,0,houses,cost,m,n,target,memo);
        // if ans is INT_MAX/2, i.e answer is not possible
        if(ans == Integer.MAX_VALUE/2) return -1;
        return ans;
       
    }
    int solve(int idx, int last, int t, int[] houses, int[][] cost, int m, int n, int target,int memo[][][]){
        if(t > target) return Integer.MAX_VALUE/2; //exceeded the target limit for the number of neighbours, output not possible
        if(idx == m){ // reached out of the array
            if(t == target) return 0; // if there are exactly target neighbours
            else return Integer.MAX_VALUE/2; // else answer not possible
        }
        
        if(memo[idx][last][t]!=-1)
            return memo[idx][last][t];
        
        int ans = Integer.MAX_VALUE/2;
        if(houses[idx] == 0){ // the house can be painted with any of colour 1 to n
            for(int j=0; j<n; j++){
                ans = Math.min(ans, cost[idx][j] + solve(idx+1, j+1, last == j+1?t:t+1, houses, cost,m,n,target,memo));
            }
        }
        else{ // house has been painted last summer, cannot paint
            // only to check if the last house is of same colour as present, and change t accordingly
            ans = Math.min(ans, solve(idx+1, houses[idx], last == houses[idx]?t: t+1, houses, cost, m, n, target,memo));
        }
        memo[idx][last][t]=ans;
        return memo[idx][last][t];
    }
    //Recursive
	 public int minCostR(int[] houses, int[][] cost, int m, int n, int target) {
	       int ans = solve(0,0,0,houses,cost,m,n,target);
	        if(ans == Integer.MAX_VALUE/2) return -1;
	        return ans;
	       
	    }
	    int solve(int idx, int last, int t, int[] houses, int[][] cost, int m, int n, int target){
	        if(t > target) return Integer.MAX_VALUE/2; //exceeded the target limit for the number of neighbours, output not possible
	        if(idx == m){ // reached out of the array
	            if(t == target) return 0; // if there are exactly target neighbours
	            else return Integer.MAX_VALUE/2; // else answer not possible
	        }
	        int ans = Integer.MAX_VALUE/2;
	        if(houses[idx] == 0){ // the house can be painted with any of colour 1 to n
	            for(int j=0; j<n; j++){
	                ans = Math.min(ans, cost[idx][j] + solve(idx+1, j+1, last == j+1?t:t+1, houses, cost,m,n,target));
	            }
	        }
	        else{ // house has been painted last summer, cannot paint
	            // only to check if the last house is of same colour as present, and change t accordingly
	            ans = Math.min(ans, solve(idx+1, houses[idx], last == houses[idx]?t: t+1, houses, cost, m, n, target));
	        }
	        return ans;
	    }
}
