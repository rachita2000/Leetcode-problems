package solved;
import java.util.*;
public class Triangle {

	public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int memo[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                memo[i][j]=-1;
            }
        }
        int ans=helper(triangle, 0, 0,memo);
        return ans;
        
    }
    
    public int helper(List<List<Integer>> triangle, int ind, int i,int memo[][]){
        
        if(ind==triangle.size()){
            return 0;
        }
        if(memo[ind][i]!=-1)
            return memo[ind][i];
        
        List<Integer> temp=triangle.get(ind);
        
        int sum=temp.get(i);
        if(ind< triangle.size()-1)
        {
            sum+=Math.min(helper(triangle, ind+1, i, memo), helper(triangle, ind+1, i+1, memo));
        }
        memo[ind][i]=sum;
        return memo[ind][i];
            
    }
}
