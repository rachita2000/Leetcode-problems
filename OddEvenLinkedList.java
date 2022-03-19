package solved;

public class OddEvenLinkedList {

	 public ListNode oddEvenList(ListNode head) {
	        if(head==null || head.next==null) return head;
	        ListNode oddHead=null , oddTail=null;
	        ListNode evenHead=null , evenTail=null;
	        ListNode cur=head;
	        int i=1;
	        while(cur!=null)
	        {
	            if(i%2==1)
	            {
	                if(oddHead==null)
	                {
	                    oddHead=cur;
	                    oddTail=cur;
	                }
	                else
	                {
	                    oddTail.next=cur;
	                    oddTail=oddTail.next;
	                }
	            }
	            else
	            {
	                if(evenHead==null)
	                {
	                    evenHead=cur;
	                    evenTail=cur;
	                }
	                else
	                {
	                    evenTail.next=cur;
	                    evenTail=evenTail.next;
	                }
	            }
	            
	            cur=cur.next;
	            i++;
	        }
	        
	        evenTail.next=null;
	        oddTail.next=evenHead;
	        
	        return oddHead;
	    }
}
