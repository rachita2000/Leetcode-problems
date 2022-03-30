package solved;

public class DeleteTheMiddleNodeOfALinkedList {

	public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head, fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode cur=head;
        while(cur.next!=slow)
        {
            cur=cur.next;
        }
        cur.next=slow.next;
        return head;
        
        
    }
}
