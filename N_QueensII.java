package solved;

public class N_QueensII {

	public int totalNQueens(int n) {
        char[][]board=new char[n][n];
      
         return solve(board,0);  
    }
    private int solve(char[][] board, int col)
    {
        if(col==board.length)
            return 1;
        
        int ans=0;
        for(int row=0;row<board.length;row++)
        {
            if(validate(board,row, col))
            {
                board[row][col]='Q';
                ans+=solve(board, col+1);
                board[row][col]='\u0000';
            }
        }
        
        return ans;
    }
    
    private boolean validate(char[][] board, int row, int col)
    {
        int tmprow=row;
        int tmpcol=col;
        
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')
                return false;
            col--;
            row--;
        }
        
        row=tmprow;
        col=tmpcol;
        
        while(col>=0)
        {
            if(board[row][col]=='Q')
                return false;
            col--;
        }
        row=tmprow;
        col=tmpcol;
        
        while(col>=0 && row< board.length)
        {
            if(board[row][col]=='Q')
                return false;
            col--;
            row++;
        }
        
        return true;
    }
}
