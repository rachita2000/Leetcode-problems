package solved;

public class ReverseLinkedList {

	 public ListNode reverseList(ListNode head) {
	        if(head==null) return head;
	        ListNode cur=head, pre=null, tmp=null;
	        while(cur!=null)
	        {
	            tmp=cur.next;
	            cur.next=pre;
	            pre=cur;
	            cur=tmp;
	        }
	        return pre;
	    }
}
