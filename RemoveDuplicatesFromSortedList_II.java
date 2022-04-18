package solved;

public class RemoveDuplicatesFromSortedList_II {

	public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode cur=head;
        ListNode dummy=new ListNode(-1);
        ListNode pre=dummy;
        pre.next=cur;
        while(cur!=null)
        {
            while(cur.next!=null && cur.val==cur.next.val)
            {
                cur=cur.next;
            }
            if(pre.next !=cur)
            {
                pre.next=cur.next;
                cur=cur.next;
            }
            else
            {
                pre=pre.next;
                cur=cur.next;
            }
        }
        return dummy.next;
    }
}
