package solved;

public class DeleteOperationForTwoStrings {

	public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        
        int [][]memo=new int[m+1][n+1];
        for(int i=0;i<m+1;i++)
            for(int j=0;j<n+1;j++)
                memo[i][j]=-1;
        
        int lcs= LCS(word1,word2,memo);
        
        
        
        return m+n-(2*lcs);
    }
    
    public int LCS(String s1, String s2, int [][]memo){
        int m=s1.length();
        int n=s2.length();
        if(m==0 || n==0){
            memo[m][n]=0;
            return memo[m][n];
        }
            
        
        if(memo[m][n]!=-1)
            return memo[m][n];
        
        int op1=0;
        int op2=0;
        
        if(s1.charAt(0)==s2.charAt(0)){
           memo[m][n]= 1+ LCS(s1.substring(1),s2.substring(1),memo);
            return memo[m][n];
        }else{
            
            op1=LCS(s1.substring(1),s2,memo);
            
            op2=LCS(s1,s2.substring(1),memo);
        }
        memo[m][n]=Math.max(op1,op2);
        
        return memo[m][n];
    }
}
