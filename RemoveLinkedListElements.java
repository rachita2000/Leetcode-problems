package solved;

public class RemoveLinkedListElements {

	 public ListNode removeElements(ListNode head, int val) {
	        if(head==null) return head;
	        ListNode dummy=new ListNode(-1);
	        
	        ListNode cur=dummy, tmp=head;
	        while(tmp!=null)    
	        {
	            if(tmp.val!=val)
	            {
	                cur.next=tmp;
	                cur=cur.next;
	            }
	            tmp=tmp.next;
	        }
	        
	        cur.next=null;
	        
	        return dummy.next;
	    }
}
