package solved;
import java.util.*;
public class N_Queens {

	public List<List<String>> solveNQueens(int n) {
        //Create a board of length n X n
        char[][]board=new char[n][n];
        //fill dots in whole board
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        //create an ans List to store the result
        List<List<String>>ans=new LinkedList<>();
        //call the function to get result
        solve(board,0,ans);
        //return the ans
        return ans;
    }
    public void solve(char[][]board,int col,List<List<String>>ans){
        //Base case if we already fill all the column
        //which means we have an solution so add it into ans and return
        if(col==board.length){
            List<String>temp=generate(board);
            ans.add(temp);
            return;
        }
        
        //try to place the queen in every row at a particular column
        for(int row=0;row<board.length;row++){
            //check can we place queen at current position or not
            if(validate(board,row,col)){
            	//If yes
                //place the queen at current position
                board[row][col]='Q';
                //recursive call
                solve(board,col+1,ans);
                //backtracking
                board[row][col]='.';
            }
        }
    }
    
    public boolean validate(char[][]board,int row,int col){
        int tempRow=row;
        int tempCol=col;
        
        //Checking diagonally upward in left
        while(row>=0 && col>=0){
            if(board[row][col]=='Q')
                return false;
            
            row--;
            col--;
        }
        
        row=tempRow;
        col=tempCol;
        //Checking in left direction
        while(col>=0){
            if(board[row][col]=='Q')
                return false;
            
            col--;
        }
        
        row=tempRow;
        col=tempCol;
        //Checking diagonally downward in left
         while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') 
                  return false;
            col--;
            row++;
        }
        return true;
    }
    
    //Basic function used to generate the ans in form of list of String
    public List<String> generate(char[][]board){
        List<String>res=new LinkedList<>();
        for(int i=0;i<board.length;i++){
            String s="";
            for(int j=0;j<board.length;j++){
                s+=board[i][j];
            }
            res.add(s);
        }
        return res;
    }
}
