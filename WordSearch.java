package solved;

public class WordSearch {

    public boolean exist(char[][] mat, String s){
	    int m=mat.length;
	    int n=mat[0].length;
	 
	    boolean visited[][]=new boolean[m][n];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            if(mat[i][j]==s.charAt(0) && helper(s,0, mat,i,j,visited)){
	                   return true;
	            }
	        }
	    }
	    return false;
	    
	}
	
	boolean helper(String s,int ind,char[][]mat,int r,int c,boolean [][]visited){
	    if(ind==s.length())
	      return true;
	      
	      if(r<0 || c<0 ||  r>=mat.length || c>=mat[0].length || mat[r][c]!=s.charAt(ind) || visited[r][c])
	          return false;
	      
	    visited[r][c]=true;
	    
	    
	    if(helper(s,ind+1,mat,r-1,c,visited) ||
	       helper(s,ind+1,mat,r+1,c,visited) ||
	       helper(s,ind+1,mat,r,c-1,visited) ||
	       helper(s,ind+1,mat,r,c+1,visited))
	        return true;
	    
	      visited[r][c]=false;
	    return false;
	}
}
