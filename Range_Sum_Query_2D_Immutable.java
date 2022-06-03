package solved;

class NumMatrix {

    private int[][] dp;
    public NumMatrix(int[][] m) {
        if(m.length==0 || m[0].length==0) return;
        dp=new int[m.length][m[0].length+1];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                dp[i][j+1]=dp[i][j]+m[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int r = row1; r <= row2; r++) {
            sum+=dp[r][col2+1]-dp[r][col1];
        }
        return sum;
    }
}

public class Range_Sum_Query_2D_Immutable {
	
}
