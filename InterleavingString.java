package solved;

public class InterleavingString {

	//Memorization
	public boolean isInterleave(String s1, String s2, String s3) {
        int s1Len=s1.length();
        int s2Len=s2.length();
        int s3Len=s3.length();
       
       if(s1Len+s2Len!=s3Len)
           return false;
       if(s2Len==0)
           return s1.equals(s3);
       
       if(s1Len==0)
           return s2.equals(s3);
       
         //-1 not check
        //0 false
        //1 true
       int[][]memo=new int[s1Len+1][s2Len+1];
       for(int i=0;i<=s1Len;i++){
           for(int j=0;j<=s2Len;j++)
               memo[i][j]=-1;
       }
       return helper(s1,s2,s3,memo);
   }
   
   public boolean helper(String s1, String s2, String s3,int[][]memo){
        int s1Len=s1.length();
        int s2Len=s2.length();
        int s3Len=s3.length();
       
       if(memo[s1Len][s2Len]!=-1){
          if(memo[s1Len][s2Len]==0)
              return false;
           else 
               return true;
       }
       if(s1Len+s2Len!=s3Len){
           memo[s1Len][s2Len]=0;
           return false;
       }
           
       
       if(s2Len==0){
           if(s1.equals(s3)){
               memo[s1Len][s2Len]=1;
               return true;
           }else{
               memo[s1Len][s2Len]=0;
               return false;
           }
       }
   
       
       if(s1Len==0){
           if(s2.equals(s3)){
               memo[s1Len][s2Len]=1;
               return true;
           }else{
               memo[s1Len][s2Len]=0;
               return false;
           }
       }
       
       boolean op1=false;
       if(s1.charAt(0)==s3.charAt(0)){
           op1=helper(s1.substring(1),s2,s3.substring(1),memo);
       }
       boolean op2=false;
       if(s2.charAt(0)==s3.charAt(0)){
           op2=helper(s1,s2.substring(1),s3.substring(1),memo);
       }
       
       if(op1||op2){
           memo[s1Len][s2Len]=1;
           return true;
       }else{
           memo[s1Len][s2Len]=0;
           return false;
       }
   }
}
