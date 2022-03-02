package solved;
import java.util.*;
public class DailyTemperature {

	public static int[] dailyTemperatures(int[] a) {
	    Stack<Integer> s=new Stack<>();
        s.push(0);
        int[] ans=new int[a.length];
        Arrays.fill(ans, 0);
        for(int i=1;i<a.length;i++)
        {
            while(!s.isEmpty() && a[s.peek()]< a[i])
            {
                ans[s.peek()]=i-s.peek();
                s.pop();
            }
                s.push(i);
        }
        return ans;
    }
//	public static void main(String[] args) {
//		int[] n= {73,74,75,71,69,72,76,73};
//		int[] a=dailyTemperatures(n);
//		for(int i:a)
//			System.out.print(i+" ");
//	}
}
