package solved;

public class SpiralMatrixII {

	 public int[][] generateMatrix(int n) {
	        int[][] ans=new int[n][n];
	        int val=1;
	        int r1=0, r2=n-1;
	        int c1=0, c2=n-1;
	        while(r1<=r2 && c1<=c2)
	        {
	            //left to right
	            for(int c=c1;c<c2;c++)
	               ans[r1][c]= val++;
	            //up to down
	            for(int r=r1;r<r2;r++)
	                ans[r][c2]=val++;
	            
	            //right to left
	            for(int c=c2;c>c1;c--)
	                ans[r2][c]=val++;
	            
	            //down to up
	            for(int r=r2;r>r1;r--)
	                ans[r][c1]=val++;
	            
	            // when n is odd & to fill the center value
	            if(r1==r2 && c1==c2)
	                ans[r1][c1]=val++;
	            r1++;
	            r2--;
	            c1++;
	            c2--;
	        }
	        return ans;
	    }
}
