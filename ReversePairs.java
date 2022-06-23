package solved;
import java.util.*;
public class ReversePairs {

	  public int reversePairs(int[] nums) {
	       return mergeSort(nums,0,nums.length-1);
	    }
	    public int mergeSort(int []arr,int i,int j){
	        
	        if(i>=j)
	            return 0;
	            int count=0;
	       
	            int mid=(i+j)/2;
	            count+=mergeSort(arr, i, mid);
	            count+=mergeSort(arr, mid+1, j);
	            count+=merge(arr, i, mid, j);
	            
	        
	        return count;
	    }
	    public int merge(int[]arr,int si,int mid,int ei){
	        int count=0;
	        int j=mid+1;
	        for(int i=si;i<=mid;i++)
	        {
	            while(j<=ei && arr[i] > 2*(long)arr[j])
	                j++;
	            
	            count+=j-(mid+1);
	        }
	        
	        ArrayList<Integer> temp = new ArrayList<>(); 
	        int left = si, right = mid+1;
	        while(left<=mid && right<=ei){
	            if(arr[left]<arr[right]){
	                temp.add(arr[left]);
	                left++;
	            }else{
	                temp.add(arr[right]);
	                right++;
	            }
	        }
	        
	        while(left<=mid){
	            temp.add(arr[left]);
	            left++;
	        }
	        while(right<=ei){
	            temp.add(arr[right]);
	            right++;
	        }
	        
	         for(int i = si; i<=ei;i++) {
	            arr[i] = temp.get(i - si); 
	        }
	        return count;
	    }     
}
