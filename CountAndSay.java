package solved;

public class CountAndSay {

	public String countAndSay(int n) {
        if(n==1)
            return "1";
        String ans="11";
        while(n>2)
        {
            StringBuilder tmp=new StringBuilder();
            for(int i=0;i<ans.length();i++)
            {
                int count=1;
                while(i+1<ans.length() && ans.charAt(i)==ans.charAt(i+1))
                {
                    count++;
                    i++;
                }
                tmp.append(count).append(ans.charAt(i));
            }
            ans=tmp.toString();
            n--;
        }
        return ans;
    }
}
