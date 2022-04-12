package solved;

public class GameOfLife {

	public void gameOfLife(int[][] board) {
        int row=board.length;
        int col=board[0].length;
            
        // dx and dy are the direction coordinates of (x,y)-> (0,0) in anti-clockwise direction
        int dx[]={1,1,0,-1,-1,-1,0,1};
        int dy[]={0,1,1,1,0,-1,-1,-1};
            
        for(int i=0;i<row;i++) 
        {
            for(int j=0;j<col;j++){
             int livecell=0;
            for(int k=0;k<8;k++)
            {
                if(notOutOfMatrix(i+dx[k], j+dy[k], row, col) && Math.abs(board[i+dx[k]][j+dy[k]])==1)
                    livecell++;
            }
                if(board[i][j]==0 && livecell==3)
                    board[i][j]=2;
                if(board[i][j]==1 && (livecell <2 || livecell > 3))
                    board[i][j]=-1;
            } 
        }
        
        for(int i=0;i<row;i++) 
        {
            for(int j=0;j<col;j++){
                if(board[i][j] <1 )
                    board[i][j]=0;
                else
                    board[i][j]=1;
            }
        }
    }
        
        private boolean notOutOfMatrix(int x, int y, int row, int col)
        {
                return (x>=0 && y>=0 && x<row && y<col);
        }
}
