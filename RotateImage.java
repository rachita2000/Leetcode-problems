package solved;

public class RotateImage {

	public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int tmp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=tmp;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int tmp=mat[i][j];
                mat[i][j]=mat[i][n-1-j];
                mat[i][n-1-j]=tmp;
            }
        }
        
    }
}
