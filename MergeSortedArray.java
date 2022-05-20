package solved;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = nums1.length - 1;
		m--;
		n--;
		while (m >= 0 && n >= 0) {
			nums1[c--] = nums1[m] < nums2[n] ? nums2[n--] : nums1[m--];
		}

		while (n >= 0) 
			nums1[c--] = nums2[n--];
    }
	
}
