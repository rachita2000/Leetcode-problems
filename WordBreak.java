package solved;
import java.util.*;
public class WordBreak {

	public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> search=new HashSet<>(wordDict);
        int n=s.length();
        boolean []dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dp[j] && search.contains(s.substring(j,i)))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        
        return dp[n];
    }
}
