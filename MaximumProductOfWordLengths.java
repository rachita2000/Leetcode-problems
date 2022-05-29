package solved;

public class MaximumProductOfWordLengths {

	public int maxProduct(String[] words) {
        int n=words.length;
        int[] bitmask=new int[n];
        
        for(int i=0;i<n;i++)
        {
            for(char ch: words[i].toCharArray())
            {    
                int num= 1 << (ch-'a');
                bitmask[i] |= num;
            }
        }
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && ((bitmask[i] & bitmask[j])==0))
                    ans=Math.max(ans, words[i].length() * words[j].length());
            }
        }
        
        return ans;
    }
}
