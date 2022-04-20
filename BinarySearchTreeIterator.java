package solved;

import java.util.Stack;

class BSTIterator {

    private Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        TreeNode cur=root;
        while(cur!=null)
        {
            st.push(cur);
            cur=cur.left;
        }
    }
    
    public int next() {
        TreeNode node=st.pop();
        TreeNode cur=node.right;
        while(cur!=null)
        {
            st.push(cur);
            cur=cur.left;
        }
        
        return node.val;
    }
    
    public boolean hasNext() {
         return !st.isEmpty();
    }
}
