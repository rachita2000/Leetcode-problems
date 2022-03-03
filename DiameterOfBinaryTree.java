package solved;

public class DiameterOfBinaryTree {

	public int diameterOfBinaryTree(TreeNode root){
		if(root==null) return 0;
        int diameter[]=new int[1];
        diameterOfBinaryTree(root, diameter);
        return diameter[0];
	}

	private  int diameterOfBinaryTree(TreeNode root, int[] diameter) {
		if(root==null) return 0;
		int lh=diameterOfBinaryTree(root.left, diameter);
		int rh=diameterOfBinaryTree(root.right, diameter);
		
		diameter[0]=Math.max(diameter[0], lh+rh);
		return 1+Math.max(lh, rh);		
	}
}
