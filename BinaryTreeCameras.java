package solved;

public class BinaryTreeCameras {

	  int count=0;
	    public int minCameraCover(TreeNode root) {
	       
	        if(helper(root)==0)// if root is not monitored, we place an additional camera here
	            count++;
	        
	        return count;
	    }
	    
	    public int helper(TreeNode root){
	        //Base Case
	        if(root==null)
	            return 1;
	        
	       int left=helper(root.left);
	       int right=helper(root.right);
	        
	        if(left==0 || right==0){
	            // if at least 1 child is not monitored, we need to place a camera at current node 
	            count++;
	            return 2;
	        }else if(left==1 && right==1){
	    // if both children are monitored but have no camera, we don't need to place a camera here. We place the camera at its parent node at the higher level. 
	            return 0;
	        }else{
	            // if(left==2 || right==2){
	            // return 1;
	            // }
	            
	      // if at least 1 child has camera, the current node is monitored. Thus, we don't need to place a camera here 
	            return 1;
	        }
	        
	    }
	    
}
