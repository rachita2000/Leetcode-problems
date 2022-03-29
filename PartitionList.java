package solved;

public class PartitionList {

	public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        
        ListNode tmp1=new ListNode(-1);
        ListNode tmp2=new ListNode(-1);
        ListNode t1=tmp1, t2=tmp2, cur=head;
        
        
        while(cur!=null)
        {
            if(cur.val < x)
            {
                t1.next=cur;
                t1=cur;
            }
            else
            {
                t2.next=cur;
                t2=cur;
            }
            cur=cur.next;
        }
        
        t1.next=tmp2.next;
        t2.next=null;
        return tmp1.next;
    }
}
