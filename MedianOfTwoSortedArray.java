package solved;

public class MedianOfTwoSortedArray {

	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	       int n=nums1.length+nums2.length;
	        int[] num=new int[n];
	        double median=0.0;
	        int mid=n/2;
	        int i=0, j=0;
	        int k=0;
	        while(i<nums1.length && j<nums2.length)
	        {
	            if(nums1[i]<nums2[j])
	                num[k++]=nums1[i++];
	            else
	                num[k++]=nums2[j++];
	        }
	        while(i<nums1.length)
	            num[k++]=nums1[i++];
	        while(j<nums2.length)
	            num[k++]=nums2[j++];
	        if(n%2!=0)
	            median= num[mid];
	        else
	            median= (num[mid]+num[mid-1])/2.0;
	        return median;
	    }
}
