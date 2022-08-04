package solved;

public class RangeSumQuerryMutable {

	class NumArray {
		  int[] arr;    
		  int[] BITree; 

		  public NumArray(int[] nums) {
		    int n = nums.length;
		    arr = new int[n];
		    BITree = new int[n + 1];

		    for (int i = 0; i < n; i++) {
		      update(i, nums[i]); 
		      arr[i] = nums[i];   
		    }
		  }

		  void update(int i, int val) {
		    int diff = val - arr[i]; 
		    arr[i] = val;           

		    i++;
		    while (i <= arr.length) {
		      BITree[i] += diff; 
		      i += i & (-i);     
		    }
		  }

		  int getSum(int i) {
		    int sum = 0;

		    i++;
		    while (i > 0) {
		      sum += BITree[i]; 
		      i -= i & (-i);    
		    }
		    return sum;
		  }

		  public int sumRange(int i, int j) {
		    return getSum(j) - getSum(i - 1);
		  }
		}
}
