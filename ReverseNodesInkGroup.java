package solved;

public class ReverseNodesInkGroup {
	  public ListNode reverseKGroup(ListNode head, int k) {
	        if(head==null) return null;
	        
	        ListNode cur=head, tmp=null, pre=null;
	        int count=0;
	        while(count<k && cur!=null)
	        {
	            tmp=cur.next;
	            cur.next=pre;
	            pre=cur;
	            cur=tmp;
	            
	            count++;
	        }
	        if(kLength(tmp, k))
	            head.next=reverseKGroup(tmp, k);
	        else
	            head.next=tmp;
	        
	        return pre;
	    }
	    
	    private boolean kLength(ListNode head, int k)
	    {
	        ListNode cur=head;
	        for(int i=0;i<k;i++)
	        {
	            if(cur==null) return false;
	            cur=cur.next;
	        }
	        return true;
	    }
}
