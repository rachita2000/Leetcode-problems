package solved;

import java.util.Arrays;

public class LongestStringChain {

	 public int longestStrChain(String[] words) {
	        int n=words.length;
	        
	        Arrays.sort(words, (String a, String b) -> a.length() - b.length()); // sort by length
	        
	        int dp[]=new int[n];
	        
	        Arrays.fill(dp,1);
	        
	        int max=1;
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<i;j++){
	                if(compareString(words[i],words[j]) ){
	                    dp[i]=Math.max(dp[i], 1+dp[j]);
	                }
	            }
	            max=Math.max(max,dp[i]);
	        }
	        return max;
	    }
	    
	    public boolean compareString(String s1, String s2){
	        if(s1.length()!=s2.length()+1)
	            return false;
	        
	        int first=0;
	        int second=0;
	        
	        boolean flag=false;

	        while(first<s1.length() && second<s2.length()){
	            if(s1.charAt(first)==s2.charAt(second)){
	                first++;
	                second++;
	            }else{
	               if (flag) {
					// this will make sure if we are encountering the violation for the first tiem or not.
	                    return false;
	                }
	                
	                flag=true;
	                first++;
	            }
	        }
	        
	        return true;
	    }
}
