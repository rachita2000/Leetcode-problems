package solved;

public class LinkedListCycle {

	  public boolean hasCycle(ListNode head) {
	        if(head==null) return false;
	        ListNode slow=head, fast=head;
	        while(slow!=null && fast!=null)
	        {
	            if(fast.next==null) return false;
	            slow=slow.next;
	            fast=fast.next.next;
	            if(fast==slow) return true;
	        }
	        return false;
	    }
}
