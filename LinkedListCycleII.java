package solved;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
        if(head==null ) return head;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                while(head!=fast)
                {
                    head=head.next;
                    fast=fast.next;
                }
                return head;
            }
        }
        return null;
    }
}
