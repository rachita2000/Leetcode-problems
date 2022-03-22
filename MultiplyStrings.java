package solved;

public class MultiplyStrings {

	public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        int[] product=new int[n+m];
        for(int i=n-1;i>=0;i--)
        {
        	for(int j=m-1;j>=0;j--)
        	{
        		int n1=num1.charAt(i)-'0';
        		int n2=num2.charAt(j)-'0';
        		product[i+j+1] += (n1*n2);
        	}
        }
        
        int carry=0;
        for(int i=product.length-1;i>=0;i--)
        {
        	int rem=(product[i]+carry)%10;
        	carry=(product[i]+carry)/10;
        	product[i]=rem;
        }
        
        StringBuilder tmp=new StringBuilder();
        for(int i: product)
        	tmp.append(i);
        
        while(tmp.length()!=0 && tmp.charAt(0)=='0')
        	tmp.replace(0, 1, "");
        
        return tmp.length()==0 ? "0" : tmp.toString();
    }
}
