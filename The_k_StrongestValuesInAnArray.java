package solved;

import java.util.Arrays;

public class The_k_StrongestValuesInAnArray {

	public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        int m=i+(j-i)/2;
        int median=arr[m];
        int p=0;
        int[] res=new int[k];
        while(p<k)
        {
            if(median-arr[i] > arr[j]-median)
                res[p++]=arr[i++];
            else
                res[p++]=arr[j--];
        }
        
        return res;
    }
}
