package solved;

public class MaximumBinaryTree {

	 public TreeNode constructMaximumBinaryTree(int[] nums) {
	        return helper(nums, 0, nums.length);
	    }
	    private TreeNode helper(int[] nums, int s, int e)
	    {
	        if(s==e)
	            return null;
	        int max=s;
	            for(int i=s;i<e;i++)
	            {
	                if(nums[max] <nums[i])
	                    max=i;
	            }
	        TreeNode root=new TreeNode(nums[max]);
	        root.left=helper(nums, s, max);
	        root.right=helper(nums, max+1, e);
	        return root;
	    }
}
