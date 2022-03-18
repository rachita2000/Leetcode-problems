package solved;

public class ConvertSortedArrayToBinarySearchTree {

	 public TreeNode sortedArrayToBST(int[] nums) {
	        return sortedArrayToBST(nums, 0, nums.length-1);
	    }
	    private TreeNode sortedArrayToBST(int[] nums, int i, int j) {
	        if(i>j) return null;
	        int mid=i+(j-i)/2;
	        TreeNode root=new TreeNode(nums[mid]);
	        root.left=sortedArrayToBST(nums, i, mid-1);
	        root.right=sortedArrayToBST(nums, mid+1, j);
	        
	        return root;
	    }
}
